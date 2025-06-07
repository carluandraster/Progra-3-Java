package com.Modelo;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Mascota extends Observable implements Runnable {
    private String nombre;

    public Mascota(String nombre, Observer cuidador) {
        this.nombre = nombre;
        this.addObserver(cuidador);
    }

    @Override
    public void run() {
        while (true) {
            double t = 3 + Math.random() * 7;
            int necesidad = Math.round((float) Math.random() * 2); // 0: sed; 1: hambre; 2: aburrimiento
            try {
                Thread.sleep((int) t * 1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            setChanged();
            notifyObservers(necesidad);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

}
