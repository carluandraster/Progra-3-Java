package Templates;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormularioConComboBox extends Formulario {
    protected Integer[] opciones;
    protected JComboBox<Integer> comboBox;
    private JPanel panelDelComboBox;
    protected DefaultComboBoxModel<Integer> comboModel=new DefaultComboBoxModel<Integer> ();

    public FormularioConComboBox(String nombre, String titulo, ArrayList<String> inputs,
            ArrayList<String> nombresBotones,
            ArrayList<String> comandos, Integer[] opciones, String comboBox) {
        this.setearAtributos(titulo, nombresBotones, inputs, opciones);

        this.configurarVentana(nombre);

        this.configurarTitulo();

        this.configurarComboBox(comboBox);

        this.agregarInputs(inputs);

        this.agregarBotones(nombresBotones, comandos);
        this.agregarBotonFinal(nombresBotones, comandos);
        
        
    }

    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones, ArrayList<String> inputs,
            Integer[] opciones) {
        super.setearAtributos(titulo, nombresBotones, inputs);
        this.opciones = opciones;
        this.comboBox = new JComboBox<>(this.opciones);
        this.panelDelComboBox = new JPanel(new GridLayout(2, 1));
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas() + 1;
    }

    public JComboBox<Integer> getComboBox() {
        return comboBox;
    }

    protected void configurarComboBox(String comboBox){
        this.comboBox.setName(comboBox);
        this.comboBox.setModel(this.comboModel);
        this.panelDelComboBox.add(new JLabel(comboBox));
        this.panelDelComboBox.add(this.comboBox);
    }
}
