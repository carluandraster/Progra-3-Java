package com.Modelo.Estados;

public interface IState {
    public void ingresarOperando(char n);

    public double resolver();

    public void cancelarOperacion();

    public void establecerOperacion(char operacion);
}
