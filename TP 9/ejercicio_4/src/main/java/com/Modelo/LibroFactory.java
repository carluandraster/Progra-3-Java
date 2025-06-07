package com.Modelo;

public class LibroFactory {
    private static int id = -1;

    public static Libro crearLibro(String nombre) {
        id++;
        return new Libro(id, nombre);
    }
}
