package Ejercicio7;

public class Defensor extends Jugador {
    public Defensor(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }

    @Override
    public double indiceAtaque() {
        return Math.pow(potencia, 2);
    }

    @Override
    public double indiceDefensa() {
        return Math.pow(velocidad, 2);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Posicion: defensor\n" +
                "Indice de ataque: " + this.indiceAtaque() + "\n" +
                "Indice de defensa: " + this.indiceDefensa() + "\n";
    }
}
