package Ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Torneo {
    private static Torneo _instancia = null;
    private final int puntosVictoria = 3;
    private final int puntosEmpate = 1;
    private final int puntosDerrota = 0;
    private HashMap<String, Equipo> equipos;
    private List<Partido> partidos;
    private List<Gol> goles;

    private Torneo() {
        this.equipos = new HashMap<>();
        this.partidos = new ArrayList<>();
        this.goles = new ArrayList<>();
    }

    public Torneo getInstancia() {
        if (_instancia == null)
            _instancia = new Torneo();
        return _instancia;
    }

    public HashMap<String, Equipo> getEquipos() {
        return equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public List<Gol> getGoles() {
        return goles;
    }

    public void agregarEquipo(Equipo equipo) {
        this.equipos.put(equipo.getNombre(), equipo);
    }

    public void eliminarEquipo(String equipo) {
        this.equipos.remove(equipo);
    }

    public void agregarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void eliminarPartido(Partido partido) {
        this.partidos.remove(partido);
    }

    public void agregarGol(Gol gol) {
        this.goles.add(gol);
    }

    public void eliminarGol(Gol gol) {
        this.goles.remove(gol);
    }

    public Resultado getResultado(Partido partido) {
        Resultado aux = new Resultado(partido);
        for (Gol gol : goles)
            if (gol.getPartido() == partido)
                aux.agregarGol(gol);
        return aux;
    }

    private Jugador buscarJugador(String nombre) {
        Iterator<Equipo> it = this.equipos.values().iterator();
        while (it.hasNext() && !((Equipo) it).getJugadores().containsKey(nombre))
            it.next();
        if (((Equipo) it).getJugadores().containsKey(nombre))
            return ((Equipo) it).getJugadores().get(nombre);
        else
            return null;
    }

    public double getPromedioGoles(String nombre) {
        Jugador aux;
        int contador;

        aux = this.buscarJugador(nombre);
        if (aux == null)
            return -1;
        else {
            contador = aux.getPartidosJugados();
            if (contador == 0)
                return 0;
            else
                return (double) aux.getCantGolesCampeonato() / contador;
        }
    }

    public Jugador getMasGoleador(String jugadorA, String jugadorB) {
        Jugador jugA, jugB;
        jugA = this.buscarJugador(jugadorA);
        jugB = this.buscarJugador(jugadorB);
        if (jugA == null || jugB == null)
            return null;
        else if (jugA.getCantGolesCampeonato() > jugB.getCantGolesCampeonato())
            return jugA;
        else
            return jugB;
    }

    public int getCantPartidosJugados(String equipo) {
        Equipo aux = this.equipos.get(equipo);
        if (aux == null)
            return -1;
        else
            return aux.getCantPartidosGanados() + aux.getCantPartidosEmpatados() + aux.getCantPartidosPerdidos();
    }

    public int getPuntosObtenidos(String equipo) {
        Equipo aux = this.equipos.get(equipo);
        if (aux == null)
            return -1;
        else
            return aux.getCantPartidosGanados() * puntosVictoria + aux.getCantPartidosEmpatados() * puntosEmpate
                    + aux.getCantPartidosPerdidos() * puntosDerrota;
    }

    public Equipo getEquipoMayorPuntaje(String equipo1, String equipo2) {
        Equipo eq1, eq2;
        eq1 = this.equipos.get(equipo1);
        eq2 = this.equipos.get(equipo2);
        if (eq1 == null || eq2 == null)
            return null;
        else if (this.getPuntosObtenidos(equipo1) >= this.getPuntosObtenidos(equipo2))
            return eq1;
        else
            return eq2;
    }

    public Jugador getGoleadorMaxGoles(String equipo1, String equipo2) {
        Equipo eq1, eq2;
        Jugador max = new Jugador("Papi", 2000);
        Iterator<Jugador> it;
        max.setCantGolesCampeonato(0);
        eq1 = this.equipos.get(equipo1);
        eq2 = this.equipos.get(equipo2);
        if (eq1 == null || eq2 == null)
            return null;
        else {
            it = eq1.getJugadores().values().iterator();
            while (it.hasNext())
                if (((Jugador) it).getCantGolesCampeonato() >= max.getCantGolesCampeonato())
                    max = (Jugador) it;
            it = eq2.getJugadores().values().iterator();
            while (it.hasNext())
                if (((Jugador) it).getCantGolesCampeonato() >= max.getCantGolesCampeonato())
                    max = (Jugador) it;
            return max;
        }
    }
}