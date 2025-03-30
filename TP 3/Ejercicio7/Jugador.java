package Ejercicio7;

public abstract class Jugador {
    protected String nombre;
    protected double velocidad;
    protected double potencia;

    public Jugador(String nombre, double velocidad, double potencia) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getPotencia() {
        return potencia;
    }

    public abstract double indiceDefensa();

    public abstract double indiceAtaque();
}
