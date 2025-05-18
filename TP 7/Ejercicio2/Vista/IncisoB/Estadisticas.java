package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextPane;

import Ejercicio2.Modelo.Empresa;
import Ejercicio2.Modelo.Socio;
import Templates.Menu;

public class Estadisticas extends Menu implements IEstadisticas {
    private FormularioConComboBox barraBusqueda;
    private JTextPane socioMasEmergencias;
    private Integer[] dnis;

    public Estadisticas(String arg0) {
        ArrayList<String> nombresBotones = new ArrayList<>(
                Arrays.asList("Obtener listado de llamados atendidos", "Volver al menú principal"));
        this.setearAtributos(arg0, nombresBotones);
        this.configurarVentana("Estadisticas");
        this.configurarTitulo();
        this.add(this.barraBusqueda);
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
        this.barraBusqueda = new FormularioConComboBox("", "Buscar socio por DNI", new ArrayList<String>(),
                new ArrayList<>(Arrays.asList("Buscar")), new ArrayList<>(Arrays.asList(IEstadisticas.BUSCAR)),
                this.dnis, "Ingrese un DNI");
        this.socioMasEmergencias = new JTextPane();
    }

    @Override
    public int getDNI() {
        return (Integer) this.barraBusqueda.getComboBox().getSelectedItem();
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

}
