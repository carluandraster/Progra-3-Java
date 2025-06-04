package com.Modelo;

public class Carta {
    private int numero;
    private int apariciones;
    
    public Carta(int numero, int apariciones) {
        this.numero = numero;
        this.apariciones = apariciones;
    }

    public int getNumero() {
        return numero;
    }

    public int getApariciones() {
        return apariciones;
    }

    public void decrementarApariciones(){
        this.apariciones--;
    }
}
