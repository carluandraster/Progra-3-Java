package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;

import Templates.Formulario;

public class Inscripcion extends Formulario implements InterfazInscripcion {
    public Inscripcion(String nombre) {
        super(nombre, "Formulario de Inscripción", new ArrayList<>(Arrays.asList("Nombre", "DNI", "Domicilio")),
                new ArrayList<>(Arrays.asList("AGREGAR SOCIO", "Volver al Menú Principal")),
                InterfazInscripcion.comandos);
    }

    @Override
    public int getDNI() {
        return Integer.parseInt(this.botones.get("DNI").getText());
    }

    @Override
    public String getDomicilio() {
        return this.botones.get("Domicilio").getText();
    }

    @Override
    public String getNombre() {
        return this.botones.get("Nombre").getText();
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

}
