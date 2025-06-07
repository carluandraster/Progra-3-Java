package com;

import com.Modelo.*;

public class Main {
    public static void main(String[] args) {
        Juego monitor = new Juego();
        Baraja b = new Baraja();
        JugadorFactory jf = new JugadorFactory(monitor, b);

        Jugador j1 = jf.crearJugador("Andrés");
        Jugador j2 = jf.crearJugador("Carlos");
        Jugador j3 = jf.crearJugador("Juan");
        Jugador j4 = jf.crearJugador("Ximena");
        Jugador j5 = jf.crearJugador("Guille");
        
        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
    }
}