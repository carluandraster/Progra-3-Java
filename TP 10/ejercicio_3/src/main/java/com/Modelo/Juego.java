package com.Modelo;

import java.util.ArrayList;

public class Juego {
    private int i = 0;
    private int cantidadDeJugadores = 0;
    private int plantados = 0;
    private Jugador mejor = null; // Jugador que ganó más puntos en una ronda
    private boolean hayEmpate = false;
    private ArrayList<Integer> puntajes = new ArrayList<>();
    private ArrayList<Integer> manosGanadas = new ArrayList<>();
    private Jugador mejorGeneral = null; // Jugador que ganó más manos
    private boolean juegoFinalizado = false;

    public void incrementarCantidad(){
        this.cantidadDeJugadores++;
        this.puntajes.add(0);
        this.manosGanadas.add(0);
    }

    public synchronized void darTurno(Jugador j){
        int id = j.get_Id();
        while (this.i % this.cantidadDeJugadores != id && !this.juegoFinalizado) {
            System.out.println("Todavia no es el turno de " + j.getNombre());
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public synchronized void quitarTurno(String nombre){
        System.out.println("Ya no es el turno de " + nombre);
        this.i++;
        notifyAll();
    }

    public synchronized void incrementarPlantados(Jugador jugador) {
        int id = jugador.get_Id();
        int mejorId;
        this.plantados++;
        if (this.mejor == null || this.puntajes.get(id) > this.puntajes.get(this.mejor.get_Id()) && this.puntajes.get(id) <=21) {
            this.mejor = jugador;
            mejorId = jugador.get_Id();
        }
        else{
            mejorId = this.mejor.get_Id();
            this.hayEmpate = this.puntajes.get(id) == this.puntajes.get(mejorId);
        }
        if (this.plantados == this.cantidadDeJugadores) {
            System.out.println("FIN DE RONDA");
            if (this.hayEmpate) {
                System.out.println("Como hubo empate, nadie ganó la mano");
                this.hayEmpate = false;
            } else {
                System.out.println("Ganó " + this.mejor.getNombre());
                this.manosGanadas.set(mejorId, this.manosGanadas.get(mejorId) + 1);
                if (this.mejorGeneral == null || this.manosGanadas.get(mejorId) > this.manosGanadas.get(this.mejorGeneral.get_Id())) {
                    this.mejorGeneral = this.mejor;
                }
            }
            this.i = 0;
            for (int i = 0; i < this.puntajes.size(); i++) {
                this.puntajes.set(i, 0);
            }
            this.plantados = 0;         
        }
    }

    public int getPuntaje(int indice) {
        return this.puntajes.get(indice);
    }

    public void agregarPuntaje(int indice, int numero) {
        this.puntajes.set(indice, this.puntajes.get(indice) + numero);
    }

    public synchronized void finalizarJuego() {
        if (!this.juegoFinalizado) {
            this.juegoFinalizado = true;
            System.out.println("FINAL DEL JUEGO");
            System.out.println("Ganó " + mejorGeneral.getNombre());
        }
    }

    public boolean isJuegoFinalizado() {
        return juegoFinalizado;
    }

    
}
