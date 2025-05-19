package Ejercicio3.Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;

import Templates.Formulario;

public class FormularioPersona extends Formulario implements IFormulario {
    public FormularioPersona(String arg0) {
        super(arg0, "Formulario", new ArrayList<String>(Arrays.asList("Apellido", "Nombre", "Dirección")),
                new ArrayList<String>(Arrays.asList("Agregar Persona", "Consultar Listado")), IFormulario.comandos);

        this.setVisible(true);
    }

    @Override
    public String getApellido() {
        return this.inputs.get("Apellido").getText();
    }

    @Override
    public String getDireccion() {
        return this.inputs.get("Dirección").getText();
    }

    @Override
    public String getNombre() {
        return this.inputs.get("Nombre").getText();
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

}
