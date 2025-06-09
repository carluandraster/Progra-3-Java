package com.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Modelo.Calculadora;
import com.Vista.IVista;

public class Controlador implements ActionListener {
    private Calculadora calculadora;
    private IVista vista;

    public Controlador(Calculadora calculadora, IVista vista) {
        this.calculadora = calculadora;
        this.vista = vista;
        this.vista.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        char caracter = comando.toCharArray()[0];
        try {
            Integer.parseInt(comando);
            this.calculadora.ingresarOperando(caracter);
            this.vista.escribirCaracter(caracter);
        } catch (NumberFormatException excepcion) {
            if (comando.equalsIgnoreCase(IVista.COMA)) {
                this.calculadora.ingresarOperando('.');
                this.vista.escribirCaracter(',');
            } else if (comando.equalsIgnoreCase(IVista.MAS) || comando.equalsIgnoreCase(IVista.MENOS)
                    || comando.equalsIgnoreCase(IVista.POR) || comando.equalsIgnoreCase(IVista.DIVIDIR)) {
                this.calculadora.establecerOperacion(caracter);
                this.vista.escribirCaracter(caracter);
            } else if (comando.equalsIgnoreCase(IVista.CE)) {
                this.calculadora.cancelarOperacion();
                this.vista.limpiarPantalla();
            } else if (comando.equalsIgnoreCase(IVista.IGUAL)) {
                try {
                    this.vista.escribirOutput(((Double) this.calculadora.resolver()).toString());
                } catch (ArithmeticException excepcionArtimetica) {
                    this.vista.escribirOutput(excepcion.getMessage());
                }
            } else
                throw new InternalError("Comando inválido");
        }
    }
}
