package Ejercicio5.b;

public abstract class Animal implements Cloneable {
    private int esperanzadevida;
    private String nombre;

    public Animal() {
    }

    public Animal(String nombre, int esperanzadevida) {
        this.esperanzadevida = esperanzadevida;
        this.nombre = nombre;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getEsperanzadevida() {
        return esperanzadevida;
    }

    public void setEsperanzadevida(int esperanzadevida) {
        this.esperanzadevida = esperanzadevida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
