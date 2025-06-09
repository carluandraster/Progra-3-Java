package com.Modelo.Estados;

import com.Modelo.Calculadora;

public class ErrorState extends State {
    public ErrorState(Calculadora calculadora) {
        super(calculadora);
        this.resolver();
    }

    @Override
    public void ingresarOperando(char n) {
    }

    @Override
    public double resolver() throws ArithmeticException {
        throw new ArithmeticException("No es posible dividir por 0");
    }

    @Override
    public void establecerOperacion(char operacion) {
    }
}
