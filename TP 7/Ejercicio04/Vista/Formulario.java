package Ejercicio04.Vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;

import Ejercicio04.Modelo.Empresa;
import Templates.FormularioConComboBox;

public class Formulario extends FormularioConComboBox implements IFormulario {
    public Formulario(String arg0) {
        super(arg0, "FORMULARIO PEDIDO", new ArrayList<>(Arrays.asList("Cantidad")),
                new ArrayList<>(Arrays.asList("AGREGAR LÍNEA DE PEDIDO", "TERMINAR PEDIDO")),
                comandos, Empresa.get_instancia().getProductos().keySet()
                        .toArray(new String[Empresa.get_instancia().getProductos().size()]),
                "Nombre producto");
        this.setVisible(true);
    }

    @Override
    public String getNombreProducto() {
        return (String) this.comboBox.getSelectedItem();
    }

    @Override
    public int getCantidad() {
        return Integer.parseInt(this.inputs.get("Cantidad").getText());
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

    @Override
    public void reset() {
        JTextField tf = this.inputs.get("Cantidad");
        tf.setText("Cantidad");
        tf.setForeground(Color.GRAY);
    }
}
