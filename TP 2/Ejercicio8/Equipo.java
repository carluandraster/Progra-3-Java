package Ejercicio8;

import java.util.HashMap;

public class Equipo {
    private String nombre;
    private HashMap<String, Jugador> jugadores;
    private int cantPartidosGanados;
    private int cantPartidosEmpatados;
    private int cantPartidosPerdidos;
    private int cantGolesAFavor;
    private int cantGolesEnContra;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }

    public int getCantPartidosGanados() {
        return cantPartidosGanados;
    }

    public int getCantPartidosEmpatados() {
        return cantPartidosEmpatados;
    }

    public int getCantPartidosPerdidos() {
        return cantPartidosPerdidos;
    }

    public int getCantGolesAFavor() {
        return cantGolesAFavor;
    }

    public int getCantGolesEnContra() {
        return cantGolesEnContra;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.put(jugador.getNombre(), jugador);
    }

    public boolean eliminarJugador(Jugador jugador) {
        return this.jugadores.remove(jugador.getNombre(), jugador);
    }

    public void setCantPartidosGanados(int cantPartidosGanados) {
        this.cantPartidosGanados = cantPartidosGanados;
    }

    public void setCantPartidosEmpatados(int cantPartidosEmpatados) {
        this.cantPartidosEmpatados = cantPartidosEmpatados;
    }

    public void setCantPartidosPerdidos(int cantPartidosPerdidos) {
        this.cantPartidosPerdidos = cantPartidosPerdidos;
    }

    public void setCantGolesAFavor(int cantGolesAFavor) {
        this.cantGolesAFavor = cantGolesAFavor;
    }

    public void setCantGolesEnContra(int cantGolesEnContra) {
        this.cantGolesEnContra = cantGolesEnContra;
    }
}
