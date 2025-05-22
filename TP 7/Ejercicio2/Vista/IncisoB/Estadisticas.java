package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.*;

import Ejercicio2.Modelo.Empresa;
import Ejercicio2.Modelo.Llamado;
import Ejercicio2.Modelo.OperadoraEmergencias;
import Templates.Menu;

public class Estadisticas extends Menu implements IEstadisticas {
    private JPanel barraBusqueda;
    private JComboBox<Integer> comboSocios;
    private DefaultComboBoxModel<Integer> comboModel=new DefaultComboBoxModel<Integer>();
    private JButton botonBuscar;
    private JTextPane socioMasEmergencias;

    public Estadisticas(String arg0) {
        ArrayList<String> nombresBotones = new ArrayList<>(
                Arrays.asList("Obtener listado de llamados atendidos", "Volver al menú principal"));
        this.setearAtributos("Estadisticas", nombresBotones);
        this.configurarVentana(arg0);
        this.configurarTitulo();
        this.configurarPanel();
        this.agregarBotones(nombresBotones, comandos);
        this.add(this.socioMasEmergencias);
        this.agregarBotonFinal(nombresBotones, nombresBotones);
        this.comboSocios.setModel(this.comboModel);
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 2;
    }

    @Override
    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones) {
        super.setearAtributos(titulo, nombresBotones);
        this.barraBusqueda = new JPanel(new GridLayout(2, 2, 10, 10));
        this.comboSocios = new JComboBox<>();
        this.botonBuscar = new JButton("Buscar");
        this.socioMasEmergencias = new JTextPane();
    }

    public void configurarPanel() {
        this.barraBusqueda.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Elementos
        JLabel label = new JLabel("Buscar socio por DNI");

        // Agregar componentes en orden 2x2
        this.barraBusqueda.add(label); // fila 1, columna 1
        this.barraBusqueda.add(this.botonBuscar); // fila 1, columna 2
        this.barraBusqueda.add(this.comboSocios); // fila 2, columna 1
        this.barraBusqueda.add(new JLabel()); // fila 2, columna 2 (vacío)

        add(this.barraBusqueda);
    }

    @Override
    public int getDNI() {
        return (Integer) this.comboSocios.getSelectedItem();
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
        this.botonBuscar.addActionListener(al);
    }

    @Override
    public void hacerVisible() {
        
        this.setVisible(true);
    }

    @Override
    public void hacerInvisible() {
        this.setVisible(false);
    }

    @Override
    public void actualizar(Integer[] array) {
        int i;
        Empresa empresa =  Empresa.getInstancia();
        OperadoraEmergencias opE = empresa.getOpE();
        Iterator<Llamado> llamadosAtendidos = opE.getLlamadosAtendidos();
        String mensaje = null;
        if (!llamadosAtendidos.hasNext()) {
            mensaje = "Hasta ahora no se atendieron llamadas";
        } else {
            mensaje = "Socio al que se le han atendido más llamados: "
                    + opE.getSocioMasEmergencias();
        }
        this.socioMasEmergencias.setText(mensaje);
        
        this.comboModel.removeAllElements();
        for (i = 0; i < array.length; i++) {
            this.comboModel.addElement(array[i]);
        }
    }
}
