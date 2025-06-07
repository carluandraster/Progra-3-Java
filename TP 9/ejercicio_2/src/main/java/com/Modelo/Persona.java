package com.Modelo;

public class Persona extends Thread{
    private String nombre;
    private int nroAsociado;
    private Monitor mostrador;

    public Persona(String nombre,int nroAsociado, Monitor mostrador) {
        this.nombre = nombre;
        this.nroAsociado = nroAsociado;
        this.mostrador = mostrador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroAsociado() {
        return nroAsociado;
    }

    @Override
    public void run(){
        while (this.nroAsociado>0) {
            this.mostrador.atender(this.nombre);
            System.out.println(this.nombre + " está siendo atendido");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.mostrador.liberar(this.nombre);
            this.nroAsociado--;
        }
    }
}
