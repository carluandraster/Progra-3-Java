package com.Modelo;

import com.Modelo.Estados.*;

public class Calculadora {
    private double operando1;
    private double operando2;
    private char operacion;
    private State estado;

    public Calculadora() {
        this.operando1 = 0;
        this.operando2 = 0;
        this.estado = new PrimerOperandoState(this);
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public void establecerOperacion(char operacion) {
        this.estado.establecerOperacion(operacion);
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void ingresarOperando(char n) {
        this.estado.ingresarOperando(n);
    }

    public double resolver() throws ArithmeticException {
        return this.estado.resolver();
    }

    public void cancelarOperacion() {
        this.estado.cancelarOperacion();
    }
}
