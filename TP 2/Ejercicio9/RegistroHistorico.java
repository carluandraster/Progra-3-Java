package Ejercicio9;

import java.util.ArrayList;
import java.util.Iterator;

public class RegistroHistorico {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Resultado> resultados;

    public void agregarJugador(Jugador jugador) {
        if (!this.jugadores.contains(jugador))
            this.jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarResultado(Resultado resultado) {
        Iterator<Jugador> it;
        Jugador jug;
        int recompensa1, recompensa2;
        if (!this.resultados.contains(resultado)) {
            this.resultados.add(resultado);
            if (resultado.getGolesEquipo(1) == resultado.getGolesEquipo(2))
                recompensa1 = recompensa2 = 1;
            else if (resultado.getGolesEquipo(1) > resultado.getGolesEquipo(2)) {
                recompensa1 = 3;
                recompensa2 = 0;
            } else {
                recompensa1 = 0;
                recompensa2 = 3;
            }
            it = resultado.getEquipo(1).getJugadores().iterator();
            while (it.hasNext()) {
                jug = it.next();
                jug.setPuntaje(jug.getPuntaje() + recompensa1);
            }
            it = resultado.getEquipo(2).getJugadores().iterator();
            while (it.hasNext()) {
                jug = it.next();
                jug.setPuntaje(jug.getPuntaje() + recompensa2);
            }
        }
    }

    public void eliminarResultado(Resultado resultado) {
        int recompensa1, recompensa2;
        Jugador jug;
        Iterator<Jugador> it;
        if (this.resultados.remove(resultado)) {
            if (resultado.getGolesEquipo(1) == resultado.getGolesEquipo(2))
                recompensa1 = recompensa2 = 1;
            else if (resultado.getGolesEquipo(1) > resultado.getGolesEquipo(2)) {
                recompensa1 = 3;
                recompensa2 = 0;
            } else {
                recompensa1 = 0;
                recompensa2 = 3;
            }
            it = resultado.getEquipo(1).getJugadores().iterator();
            while (it.hasNext()) {
                jug = it.next();
                jug.setPuntaje(jug.getPuntaje() - recompensa1);
            }
            it = resultado.getEquipo(2).getJugadores().iterator();
            while (it.hasNext()) {
                jug = it.next();
                jug.setPuntaje(jug.getPuntaje() - recompensa2);
            }
        }
    }

    public ArrayList<Resultado> getResultados() {
        return resultados;
    }

    public int getPartidosJugados(Jugador jugador) {
        int aux = 0;
        Iterator<Resultado> it = this.resultados.iterator();
        Resultado enc;
        while (it.hasNext()) {
            enc = it.next();
            if (enc.getEquipo(1).getJugadores().contains(jugador)
                    || enc.getEquipo(2).getJugadores().contains(jugador))
                aux++;
        }
        return aux;
    }

    public int getPartidosEmpatados(Jugador jugador) {
        int aux = 0;
        Iterator<Resultado> it = this.resultados.iterator();
        Resultado enc;
        while (it.hasNext()) {
            enc = it.next();
            if ((enc.getEquipo(1).getJugadores().contains(jugador)
                    || enc.getEquipo(2).getJugadores().contains(jugador))
                    && enc.getGolesEquipo(1) == enc.getGolesEquipo(2))
                aux++;
        }
        return aux;
    }

    public int getPartidosPerdidos(Jugador jugador) {
        int aux = 0;
        Iterator<Resultado> it = this.resultados.iterator();
        Resultado enc;
        while (it.hasNext()) {
            enc = it.next();
            if (enc.getEquipo(1).getJugadores().contains(jugador) && enc.getGolesEquipo(1) < enc.getGolesEquipo(2)
                    || enc.getEquipo(2).getJugadores().contains(jugador)
                            && enc.getGolesEquipo(2) < enc.getGolesEquipo(1))
                aux++;
        }
        return aux;
    }

    public int mismoEquipo(Jugador j1, Jugador j2) {
        int aux = 0;
        Iterator<Resultado> it = this.resultados.iterator();
        Resultado enc;
        while (it.hasNext()) {
            enc = it.next();
            if (enc.getEquipo(1).getJugadores().contains(j1) && enc.getEquipo(1).getJugadores().contains(j2)
                    || enc.getEquipo(2).getJugadores().contains(j1) && enc.getEquipo(2).getJugadores().contains(j2))
                aux++;
        }
        return aux;
    }

    public int enfrentados(Jugador j1, Jugador j2) {
        int aux = 0;
        Iterator<Resultado> it = this.resultados.iterator();
        Resultado enc;
        while (it.hasNext()) {
            enc = it.next();
            if (enc.getEquipo(1).getJugadores().contains(j1) && enc.getEquipo(2).getJugadores().contains(j2)
                    || enc.getEquipo(2).getJugadores().contains(j1) && enc.getEquipo(1).getJugadores().contains(j2))
                aux++;
        }
        return aux;
    }
}
