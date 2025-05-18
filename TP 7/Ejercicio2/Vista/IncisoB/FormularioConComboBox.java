package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;

import javax.swing.JComboBox;

import Templates.Formulario;

public class FormularioConComboBox extends Formulario {
    private Integer[] opciones;
    private JComboBox<Integer> comboBox;

    public FormularioConComboBox(String nombre, String titulo, ArrayList<String> inputs,
            ArrayList<String> nombresBotones,
            ArrayList<String> comandos, Integer[] opciones, String comboBox) {
        this.setearAtributos(titulo, nombresBotones, inputs, opciones);

        this.configurarVentana(nombre);

        this.configurarTitulo();

        this.comboBox.setName(comboBox);
        this.add(this.comboBox);

        this.agregarInputs(inputs);

        this.agregarBotones(nombresBotones, comandos);
    }

    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones, ArrayList<String> inputs,
            Integer[] opciones) {
        super.setearAtributos(titulo, nombresBotones, inputs);
        this.opciones = opciones;
        this.comboBox = new JComboBox<>(this.opciones);
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 1;
    }

    public JComboBox<Integer> getComboBox() {
        return comboBox;
    }

}
