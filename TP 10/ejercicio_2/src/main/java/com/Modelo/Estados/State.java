package com.Modelo.Estados;

import com.Modelo.Calculadora;

public abstract class State implements IState {
    protected Calculadora calculadora;

    public State(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void cancelarOperacion() {
        this.calculadora.setOperando1(0);
        this.calculadora.setOperando2(0);
        this.calculadora.setEstado(new PrimerOperandoState(this.calculadora));
    }
}
