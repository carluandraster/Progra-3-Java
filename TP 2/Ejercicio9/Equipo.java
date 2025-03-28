package Ejercicio9;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private int puntajeTotal = 0;

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void calcularPuntajeTotal() {
        Iterator<Jugador> it = this.jugadores.iterator();
        int acumulador = 0;
        while (it.hasNext())
            acumulador += it.next().getPuntaje();
        this.puntajeTotal = acumulador;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Jugador> it = this.jugadores.iterator();
        while (it.hasNext())
            sb.append(it.next() + "\n");
        return sb.toString();
    }
}
