package Ejercicio7;

public class Arquero extends Jugador {
    private double efectividad;

    public Arquero(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
        this.efectividad = 0.5;
    }

    public Arquero(String nombre, double velocidad, double potencia, double efectividad) {
        super(nombre, velocidad, potencia);
        this.efectividad = efectividad;
    }

    public double getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(double efectividad) {
        this.efectividad = efectividad;
    }

    @Override
    public double indiceAtaque() {
        return 0.1 * this.velocidad * this.potencia;
    }

    @Override
    public double indiceDefensa() {
        return this.efectividad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Posicion: arquero\n" +
                "Indice de ataque: " + this.indiceAtaque() + "\n" +
                "Indice de defensa: " + this.indiceDefensa() + "\n";
    }

}
