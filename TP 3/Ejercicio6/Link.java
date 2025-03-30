package Ejercicio6;

public class Link extends Archivo {
    private Archivo enlace;

    public Link(String nombre, Archivo enlace) {
        super(nombre, 1);
        this.enlace = enlace;
    }

    public Archivo getEnlace() {
        return enlace;
    }
}