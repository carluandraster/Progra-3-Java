package Ejercicio6;

public class ArchivoComprimido extends Archivo {
    private Directorio contenedorInterno;
    private double tasaDeCompresion;

    public ArchivoComprimido(String nombre, Directorio contenedorInterno, double tasaDeCompresion) {
        super(nombre, contenedorInterno.getTamanio() * tasaDeCompresion);
        this.contenedorInterno = contenedorInterno;
        this.tasaDeCompresion = tasaDeCompresion;
    }

    public Directorio getContenedorInterno() {
        return contenedorInterno;
    }

    public void setContenedorInterno(Directorio contenedorInterno, double tasaDeCompresion) {
        this.contenedorInterno = contenedorInterno;
        this.tasaDeCompresion = tasaDeCompresion;
        this.tamanio = this.contenedorInterno.tamanio * tasaDeCompresion;
    }

    public double getTasaDeCompresion() {
        return tasaDeCompresion;
    }

}
