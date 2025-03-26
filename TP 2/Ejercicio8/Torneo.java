package Ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Torneo {
    private static Torneo _instancia = null;
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
}
