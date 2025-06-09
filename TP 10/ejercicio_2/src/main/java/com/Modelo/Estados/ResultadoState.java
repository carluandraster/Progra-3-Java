package com.Modelo.Estados;

import com.Modelo.Calculadora;

public class ResultadoState extends State {
    public ResultadoState(Calculadora calculadora, double resultado) {
        super(calculadora);
        this.calculadora.setOperando1(resultado);
    }

    @Override
    public void ingresarOperando(char n) {
    }

    @Override
    public double resolver() {
        return this.calculadora.getOperando1();
    }

    @Override
    public void establecerOperacion(char operacion) {
        this.calculadora.setOperacion(operacion);
        this.calculadora.setEstado(new SegundoOperandoState(this.calculadora));
    }

}
