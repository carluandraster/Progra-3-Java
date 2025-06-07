package com.Modelo;

import java.util.concurrent.Semaphore;

public class Libro {
    private int idLibro;
    private String titulo;
    private Semaphore semaforo;

    public Libro(int idLibro, String titulo) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.semaforo = new Semaphore(1, false);
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void subir() {
        try {
            this.semaforo.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void bajar() {
        this.semaforo.release();
    }
}
