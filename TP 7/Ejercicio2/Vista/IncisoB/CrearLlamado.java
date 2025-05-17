package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JComboBox;

import Templates.Formulario;

public class CrearLlamado extends Formulario implements ICrearLlamado {
    private Integer[] dnis;

    public CrearLlamado(String arg0) {
        ArrayList<String> nombresBotones = new ArrayList<>(Arrays.asList("ENVIAR", "Volver al Menú Principal"));
        this.setearAtributos(arg0, nombresBotones);

        this.configurarVentana(arg0, nombresBotones.size());

        this.configurarTitulo();

        JComboBox<Integer> aux = new JComboBox<>(dnis);
        aux.setName("DNI socio");
        this.add(aux);

        this.agregarInputs(new ArrayList<>(Arrays.asList("Grado de prioridad")));

        this.agregarBotones(nombresBotones, comandos);

        setVisible(true);
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 1;
    }

    @Override
    public int getDNI() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getPrioridad() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setActionListener(ActionListener al) {
        // TODO Auto-generated method stub

    }

}
