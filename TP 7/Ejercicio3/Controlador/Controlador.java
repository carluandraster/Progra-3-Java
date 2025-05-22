package Ejercicio3.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Ejercicio1.Persona;
import Ejercicio3.Modelo.ConjuntoGenerico;
import Ejercicio3.Modelo.OperacionConjuntoInvalidaException;
import Ejercicio3.Vista.IFormulario;

public class Controlador implements ActionListener {
    private ConjuntoGenerico<Persona> baseDeDatos;
    private IFormulario formulario;

    public Controlador(IFormulario formulario) {
        this.baseDeDatos = new ConjuntoGenerico<>();
        this.formulario = formulario;
        this.setVista(formulario);
    }

    public void setVista(IFormulario vista) {
        this.formulario = vista;
        this.formulario.setActionListener(this);
    }

    // 2 comandos posibles: "agregar" y "consultar"
    // Ambos comandos están en el array de comandos
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equalsIgnoreCase(IFormulario.comandos.get(0))) { // Agregar
            String apellido = this.formulario.getApellido();
            String nombre = this.formulario.getNombre();
            String domicilio = this.formulario.getDireccion();
            try {
                this.baseDeDatos.agrega(new Persona(apellido, nombre, domicilio));
            } catch (OperacionConjuntoInvalidaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "OperacionConjuntoInvalidaException", JOptionPane.ERROR_MESSAGE);
            }
            this.formulario.reset();
        } else { // Consultar
            Iterator<Persona> it = this.baseDeDatos.getIterator();
            StringBuilder sb = new StringBuilder();
            while (it.hasNext()) {
                sb.append(it.next().toString() + "\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Listado de personas en la base de datos: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
