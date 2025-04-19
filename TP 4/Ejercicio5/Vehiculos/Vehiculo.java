package Ejercicio5.Vehiculos;

import Ejercicio5.Choferes.*;

public abstract class Vehiculo {
    private String modelo;
    private int numerointerno;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumerointerno() {
        return numerointerno;
    }

    public void setNumerointerno(int numerointerno) {
        this.numerointerno = numerointerno;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract boolean aceptoChofer(Chofer chofer);

    @Override
    public String toString() {
        return "Numero interno del vehiculo: " + this.numerointerno + "\n" +
                "Modelo: " + this.modelo + "\n";
    }
}
