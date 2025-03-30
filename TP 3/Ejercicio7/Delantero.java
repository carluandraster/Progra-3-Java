package Ejercicio7;

public class Delantero extends Jugador {
    public Delantero(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }

    @Override
    public double indiceAtaque() {
        return this.velocidad * this.potencia;
    }

    @Override
    public double indiceDefensa() {
        return this.velocidad * 0.5;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Posicion: delantero\n" +
                "Indice de ataque: " + this.indiceAtaque() + "\n" +
                "Indice de defensa: " + this.indiceDefensa() + "\n";
    }
}
