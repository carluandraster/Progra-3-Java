package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.*;

import Ejercicio2.Modelo.Empresa;
import Ejercicio2.Modelo.Socio;
import Templates.Menu;

public class Estadisticas extends Menu implements IEstadisticas {
    private JPanel barraBusqueda;
    private JComboBox<Integer> comboSocios;
    private JButton botonBuscar;
    private JTextPane socioMasEmergencias;
    private Integer[] dnis;
    static final int MAX_ELEM = 50;

    public Estadisticas(String arg0) {
        ArrayList<String> nombresBotones = new ArrayList<>(
                Arrays.asList("Obtener listado de llamados atendidos", "Volver al menú principal"));
        this.setearAtributos(arg0, nombresBotones);
        this.configurarVentana("Estadisticas");
        this.configurarTitulo();
        this.configurarPanel();
        this.agregarBotones(nombresBotones, comandos);
        this.add(this.socioMasEmergencias);
        this.agregarBotonFinal(nombresBotones, nombresBotones);
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 2;
    }

    @Override
    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones) {
        super.setearAtributos(titulo, nombresBotones);
        this.barraBusqueda = new JPanel(new GridLayout(2, 2, 10, 10));
        this.comboSocios = new JComboBox<>(this.dnis);
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
    }

    @Override
    public void hacerVisible() {
        HashMap<Integer, Socio> socios = Empresa.getInstancia().getSocios();
        this.dnis = (Integer[]) socios.keySet().toArray();
        String mensaje = null;
        if (socios.size() == 0) {
            mensaje = "Hasta ahora no se registraron socios";
        } else {
            mensaje = "Socio al que se le han atendido más llamados: "
                    + Empresa.getInstancia().getOpE().getSocioMasEmergencias();
        }
        this.socioMasEmergencias.setText(mensaje);
        this.setVisible(true);
    }

    @Override
    public void hacerInvisible() {
        this.setVisible(false);
    }
}
