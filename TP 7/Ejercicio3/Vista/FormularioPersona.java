package Ejercicio3.Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

import Templates.Formulario;

public class FormularioPersona extends Formulario implements IFormulario {
    private static String APELLIDO = "Apellido";
    private static String NOMBRE = "Nombre";
    private static String DIRECCION = "Dirección";

    public FormularioPersona(String arg0) {
        super(arg0, "Formulario", new ArrayList<String>(Arrays.asList(APELLIDO, NOMBRE, DIRECCION)),
                new ArrayList<String>(Arrays.asList("Agregar Persona", "Consultar Listado")), IFormulario.comandos);

        this.setVisible(true);
    }

    @Override
    public String getApellido() {
        return this.inputs.get(APELLIDO).getText();
    }

    @Override
    public String getDireccion() {
        return this.inputs.get(DIRECCION).getText();
    }

    @Override
    public String getNombre() {
        return this.inputs.get(NOMBRE).getText();
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

    @Override
    public void reset() {
        this.inputs.get(NOMBRE).setText(NOMBRE);
        this.inputs.get(APELLIDO).setText(APELLIDO);
        this.inputs.get(DIRECCION).setText(DIRECCION);
        for (Map.Entry<String,JTextField> tf : this.inputs.entrySet()) {
            tf.getValue().setForeground(Color.GRAY);
        }
    }

}
