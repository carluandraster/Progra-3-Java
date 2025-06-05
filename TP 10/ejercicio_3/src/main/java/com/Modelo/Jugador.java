package com.Modelo;

public class Jugador extends Thread{
    private String nombre;
    private Juego miMonitor;
    private int id;
    private Baraja baraja;

    public Jugador(String nombre, Juego miMonitor, int id, Baraja baraja) {
        this.nombre = nombre;
        this.miMonitor = miMonitor;
        this.id = id;
        this.baraja = baraja;
        this.miMonitor.incrementarCantidad();
    }

    public String getNombre() {
        return nombre;
    }

    public int get_Id() {
        return id;
    }

    @Override
    public void run() {
        Carta nuevaCarta;
        while (!this.baraja.esVacia()) {
            this.miMonitor.darTurno(this);
            if (!this.miMonitor.isJuegoFinalizado()) {
                if (this.miMonitor.getPuntaje(this.id) <= 15) {
                    System.out.println("Turno de " + this.nombre);
                    nuevaCarta = this.baraja.sacarCarta();
                    this.miMonitor.agregarPuntaje(this.id,nuevaCarta.getNumero());
                    if (this.miMonitor.getPuntaje(this.id) > 15) {
                        this.miMonitor.incrementarPlantados(this);
                        System.out.println(this.nombre + " se plantó");
                    }
                }
                this.miMonitor.quitarTurno(this.nombre);
            }
        }
        this.miMonitor.finalizarJuego();
    }
}
