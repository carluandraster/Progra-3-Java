package Ejercicio1.Modelo;

public class Mago extends Caballero {
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void incrementaPos(double incX, double incY) {
        this.posicion.incrementaPos(incX, incY);
    }
}
