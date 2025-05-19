package Ejercicio3.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio3.Vista.IFormulario;

public class Controlador implements ActionListener {
    private IFormulario formulario;

    public Controlador(IFormulario formulario) {
        this.formulario = formulario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
