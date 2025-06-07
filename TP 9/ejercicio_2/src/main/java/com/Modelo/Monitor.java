package com.Modelo;

public class Monitor {
    private boolean ocupado = false;

    public synchronized void atender(String nombre){
        while (this.ocupado) {
            System.out.println(nombre + " intentó ser atendido");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.ocupado = true;
    }

    public synchronized void liberar(String nombre) {
        System.out.println(nombre + " acaba de ser liberado");
        this.ocupado = false;
        notifyAll();
    }
}
