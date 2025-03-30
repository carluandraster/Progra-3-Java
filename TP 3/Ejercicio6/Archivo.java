package Ejercicio6;

import java.util.GregorianCalendar;

public class Archivo {
    protected String nombre;
    private GregorianCalendar fechaDeCreacion;
    private GregorianCalendar fechaDeUltimaModificacion;
    protected double tamanio; // En kB

    public Archivo(String nombre, double tamanio) {
        this.nombre = nombre;
        this.fechaDeCreacion = this.fechaDeUltimaModificacion = new GregorianCalendar();
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaDeUltimaModificacion() {
        return fechaDeUltimaModificacion;
    }

    public void modificar() {
        this.fechaDeUltimaModificacion = new GregorianCalendar();
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public GregorianCalendar getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
