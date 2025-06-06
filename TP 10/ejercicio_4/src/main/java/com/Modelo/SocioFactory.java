package com.Modelo;

public class SocioFactory {
    private Biblioteca monitor;

    public SocioFactory(Biblioteca monitor) {
        this.monitor = monitor;
    }

    public Socio crearSocio(String nombre) {
        return new Socio(nombre, this.monitor);
    }
}
