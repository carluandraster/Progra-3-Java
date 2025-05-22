package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;

public class CrearLlamado extends FormularioConComboBox implements ICrearLlamado {
    public CrearLlamado(String arg0) {
        super(arg0, "Crear llamado", new ArrayList<>(Arrays.asList("Grado de prioridad")),
                new ArrayList<>(Arrays.asList("ENVIAR", "Volver al Menú Principal")), comandos, new Integer[0], "DNI Socio");
    }

    @Override
    public int getDNI() {
        return (Integer) this.comboBox.getSelectedItem();
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
    }

    @Override
    public void hacerInvisible() {
        this.setVisible(false);
    }

    @Override
    public void actualizar(Integer[] dnis) {
        int i;
        this.comboModel.removeAllElements();
        for (i = 0; i < dnis.length; i++) {
            this.comboModel.addElement(dnis[i]);
        }
    }

    
}
