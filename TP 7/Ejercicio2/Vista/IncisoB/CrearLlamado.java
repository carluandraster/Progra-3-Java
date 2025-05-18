package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;

import Ejercicio2.Modelo.Empresa;

public class CrearLlamado extends FormularioConComboBox implements ICrearLlamado {
    private Integer[] dnis;
    private JComboBox<Integer> dniSocio;

    public CrearLlamado(String arg0, Integer[] dnis) {
        super(arg0, "Crear llamado", new ArrayList<>(Arrays.asList("Grado de prioridad")),
                new ArrayList<>(Arrays.asList("ENVIAR", "Volver al Menú Principal")), comandos, dnis, "DNI Socio");
    }

    @Override
    public int getDNI() {
        return (Integer) this.dniSocio.getSelectedItem();
    }

    @Override
    public int getPrioridad() {
        return Integer.parseInt(this.inputs.get("Grado de prioridad").getText());
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

    @Override
    public void hacerVisible() {
        this.setVisible(true);
        this.dnis = (Integer[]) Empresa.getInstancia().getSocios().keySet().toArray();
    }

}
