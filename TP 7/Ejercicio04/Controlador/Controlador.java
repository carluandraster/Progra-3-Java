package Ejercicio04.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import Ejercicio04.Modelo.Empresa;
import Ejercicio04.Modelo.LineaDePedido;
import Ejercicio04.Modelo.Pedido;
import Ejercicio04.Vista.IFormulario;
import Ejercicio3.Modelo.OperacionConjuntoInvalidaException;

public class Controlador implements ActionListener {
    private IFormulario formulario;
    private Pedido pedido;

    public Controlador(IFormulario formulario) {
        this.setVista(formulario);
        this.pedido = new Pedido(new GregorianCalendar());
    }

    public void setVista(IFormulario formulario) {
        this.formulario = formulario;
        this.formulario.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equalsIgnoreCase(IFormulario.comandos.get(0))) { // Agregar línea de pedido
            String nombreProducto = formulario.getNombreProducto();
            int cantidad = formulario.getCantidad();
            try {
                this.pedido.agrega(
                        new LineaDePedido(Empresa.get_instancia().getProductos().get(nombreProducto), cantidad));
            } catch (OperacionConjuntoInvalidaException e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage(), "OperacionConjuntoInvalidaException",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else { // Terminar pedido
            JOptionPane.showMessageDialog(null, this.pedido.toString(), "Factura del pedido",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
