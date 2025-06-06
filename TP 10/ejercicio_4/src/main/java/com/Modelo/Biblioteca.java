package com.Modelo;

import java.util.Hashtable;

public class Biblioteca {
    private Hashtable<Integer, Libro> libros;
    private Hashtable<Integer, Libro> prestados;

    public Biblioteca() {
        this.libros = new Hashtable<>();
        this.prestados = new Hashtable<>();
    }

    public Biblioteca(Hashtable<Integer, Libro> libros) {
        this.libros = libros;
        this.prestados = new Hashtable<>();
    }

    public void agregarLibro(String nombre) {
        Libro nuevoLibro = LibroFactory.crearLibro(nombre);
        this.libros.put(nuevoLibro.getIdLibro(), nuevoLibro);
    }

    public synchronized void prestar(String nombre, int id) {
        while (this.prestados.containsKey(id)) {
            System.out.println(nombre + " espera a que le presten " + this.libros.get(id).getTitulo());
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.prestados.put(id, this.libros.get(id));
    }

    public synchronized void recibirDevolucion(String nombre, int id) {
        this.prestados.remove(id);
        System.out.println(nombre + " devolvió " + this.libros.get(id).getTitulo());
        notifyAll();
    }
}
