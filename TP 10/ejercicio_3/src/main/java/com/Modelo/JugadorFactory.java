package com.Modelo;

public class JugadorFactory {
    private int id = -1;
    private Juego monitor;
    private Baraja baraja;

    public JugadorFactory(Juego monitor, Baraja baraja) {
        this.monitor = monitor;
        this.baraja = baraja;
    }

    public Jugador crearJugador(String nombre){
        this.id++;
        return new Jugador(nombre, this.monitor, this.id, this.baraja);
    }
}
