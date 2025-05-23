package Templates;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class FormularioConComboBox extends Formulario {
    protected String[] opciones;
    protected JComboBox<String> comboBox;
    private JPanel panelDelComboBox;
    protected DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();

    public FormularioConComboBox(String nombre, String titulo, ArrayList<String> inputs,
            ArrayList<String> nombresBotones,
            ArrayList<String> comandos, String[] opciones, String comboBox) {
        this.setearAtributos(titulo, nombresBotones, inputs, opciones);

        this.configurarVentana(nombre);

        this.configurarTitulo();

        this.configurarComboBox(comboBox);

        this.agregarInputs(inputs);

        this.agregarBotones(nombresBotones, comandos);
        this.agregarBotonFinal(nombresBotones, comandos);

    }

    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones, ArrayList<String> inputs,
            String[] opciones) {
        super.setearAtributos(titulo, nombresBotones, inputs);
        this.opciones = opciones;
        this.comboBox = new JComboBox<>(this.opciones);
        this.panelDelComboBox = new JPanel(new GridLayout(2, 1));
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 1;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    protected void configurarComboBox(String comboBox) {
        this.comboBox.setName(comboBox);
        this.comboBox.setModel(this.comboModel);
        JLabel jl = new JLabel(comboBox);
        jl.setFont(new Font("Segoe UI", 1, 32));
        this.panelDelComboBox.add(jl);
        this.panelDelComboBox.add(this.comboBox);
        for (String opcion : this.opciones) {
            this.comboModel.addElement(opcion);
        }
        this.comboBox.setFont(new Font("Segoe UI", 1, 32));
        this.add(this.panelDelComboBox);
    }
}
