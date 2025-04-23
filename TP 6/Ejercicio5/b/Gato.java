package Ejercicio5.b;

public class Gato extends Animal {
    public Gato() {
        super();
    }

    public Gato(String nombre, int esperanzadevida) {
        super(nombre, esperanzadevida);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("No se puede clonar un gato");
    }
}
