package Templates;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;

public abstract class Formulario extends Menu {
    protected ArrayList<String> inputs;

    public Formulario() {
        super();
    }

    public Formulario(String nombre, String titulo, ArrayList<String> inputs, ArrayList<String> nombresBotones,
            ArrayList<String> comandos) {
        this.setearAtributos(titulo, nombresBotones, inputs);

        this.configurarVentana(nombre, nombresBotones.size());

        this.configurarTitulo();

        this.agregarInputs(inputs);

        this.agregarBotones(nombresBotones, comandos);

        setVisible(true);
    }

    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones, ArrayList<String> inputs) {
        super.setearAtributos(titulo, nombresBotones);
        this.inputs = inputs;
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + this.inputs.size();
    }

    protected void agregarInputs(ArrayList<String> inputs) {
        JTextField tf = new JTextField();
        Iterator<String> it = inputs.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            tf.setText(aux);
            tf.setFont(new java.awt.Font("Segoe UI", 1, 48));
            this.add(tf);

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
