package com.Modelo.Estados;

import com.Modelo.Calculadora;

public class PrimerOperandoState extends State {
    private StringBuilder op1;

    public PrimerOperandoState(Calculadora calculadora) {
        super(calculadora);
        this.op1 = new StringBuilder();
    }

    @Override
    public void ingresarOperando(char n) {
        this.op1.append(n);
    }

    @Override
    public double resolver() {
        this.calculadora.setOperando1(Double.parseDouble(this.op1.toString()));
        return this.calculadora.getOperando1();
    }

    @Override
    public void cancelarOperacion() {
        this.calculadora.setOperando1(0);
    }

    @Override
    public void establecerOperacion(char operacion) {
        this.calculadora.setOperando1(Double.parseDouble(this.op1.toString()));
        this.calculadora.setOperacion(operacion);
        this.calculadora.setEstado(new SegundoOperandoState(this.calculadora));
    }

}
