package com.Modelo;

public class Socio extends Thread {
    private Biblioteca biblioteca;

    public Socio(String nombre, Biblioteca biblioteca) {
        this.setName(nombre);
        this.biblioteca = biblioteca;
    }

    @Override
    public void run() {
        int N = (int) Math.round(Math.random() * 10);
        for (int i = 0; i < N; i++) {
            int id = (int) Math.round(Math.random() * 5);
            this.biblioteca.prestar(this.getName(), id);
            System.out.println(this.getName() + " obtuvo su libro");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.biblioteca.recibirDevolucion(this.getName(), id);
        }
    }
}
