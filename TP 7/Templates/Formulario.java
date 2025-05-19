package Templates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;

public abstract class Formulario extends Menu {
    protected HashMap<String, JTextField> inputs;

    public Formulario() {
        super();
    }

    public Formulario(String nombre, String titulo, ArrayList<String> inputs, ArrayList<String> nombresBotones,
            ArrayList<String> comandos) {
        this.setearAtributos(titulo, nombresBotones, inputs);

        this.configurarVentana(nombre);

        this.configurarTitulo();

        this.agregarInputs(inputs);

        this.agregarBotones(nombresBotones, comandos);

        this.agregarBotonFinal(nombresBotones, comandos);
    }

    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones, ArrayList<String> inputs) {
        super.setearAtributos(titulo, nombresBotones);
        this.inputs = this.copiarClavesInput(inputs);
    }

    protected HashMap<String, JTextField> copiarClavesInput(ArrayList<String> claves) {
        Iterator<String> it = claves.iterator();
        HashMap<String, JTextField> aux = new HashMap<>();

        while (it.hasNext()) {
            aux.put(it.next(), null);
        }
        return aux;
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + this.inputs.size();
    }

    protected void agregarInputs(ArrayList<String> inputs) {
        Iterator<String> it = inputs.iterator();

        while (it.hasNext()) {
            JTextField tf = new JTextField();
            String aux = it.next();
            tf.setText(aux);
            tf.setFont(new java.awt.Font("Segoe UI", 1, 48));
            this.add(tf);
            this.inputs.replace(aux, tf);

            // Poner al input un placeholder
            tf.setForeground(Color.GRAY); // color del texto placeholder
            tf.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (tf.getText().equals(aux)) {
                        tf.setText("");
                        tf.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (tf.getText().isEmpty()) {
                        tf.setText(aux);
                        tf.setForeground(Color.GRAY);
                    }
                }
            });
        }
    }
}
