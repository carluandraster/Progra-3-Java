package Ejercicio5.Vehiculos;

import Ejercicio5.Choferes.Chofer;

public abstract class Colectivo extends Vehiculo {
    private int cantidadPasajeros;

    public Colectivo(String modelo) {
        super(modelo);
        this.cantidadPasajeros = 0;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros >= 0)
            this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public abstract boolean aceptoChofer(Chofer chofer);

    @Override
    public String toString() {
        return super.toString() +
                "Cantidad de pasajeros: " + this.cantidadPasajeros + "\n";
    }
}
