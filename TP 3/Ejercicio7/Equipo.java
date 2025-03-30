package Ejercicio7;

import java.util.HashMap;
import java.util.Iterator;

public class Equipo {
    private HashMap<String, Jugador> jugadores;

    public Equipo() {
        this.jugadores = new HashMap<>();
    }

    // public String agregaDelantero(String nombre, double velocidad, double
    // potencia) {
    // if (velocidad < 0 || velocidad > 1)
    // return "No es posible crear un jugador con velocidad " + velocidad;
    // else if (potencia < 0 || potencia > 1)
    // return "No es posible crear un jugador con potencia " + potencia;
    // else {
    // this.jugadores.put(nombre, new Delantero(nombre, velocidad, potencia));
    // return "Jugador creado con exito";
    // }
    // }

    // public String agregaDefensor(String nombre, double velocidad, double
    // potencia) {
    // if (velocidad < 0 || velocidad > 1)
    // return "No es posible crear un jugador con velocidad " + velocidad;
    // else if (potencia < 0 || potencia > 1)
    // return "No es posible crear un jugador con potencia " + potencia;
    // else {
    // this.jugadores.put(nombre, new Defensor(nombre, velocidad, potencia));
    // return "Jugador creado con exito";
    // }
    // }

    // public String agregaArquero(String nombre, double velocidad, double potencia)
    // {
    // if (velocidad < 0 || velocidad > 1)
    // return "No es posible crear un jugador con velocidad " + velocidad;
    // else if (potencia < 0 || potencia > 1)
    // return "No es posible crear un jugador con potencia " + potencia;
    // else {
    // this.jugadores.put(nombre, new Arquero(nombre, velocidad, potencia));
    // return "Jugador creado con exito";
    // }
    // }

    // Sí, podría delegarse la creación del jugador en otro lugar
    public String agregaJugador(Jugador jugador) {
        this.jugadores.put(jugador.getNombre(), jugador);
        return "Jugador creado con exito";
    }

    public void eliminaJugador(Jugador jugador) {
        this.jugadores.remove(jugador.getNombre());
    }

    public Iterator<Jugador> getJugadores() {
        return jugadores.values().iterator();
    }

    public double indiceDefensa() {
        Iterator<Jugador> it = this.getJugadores();
        double aux = 0;
        while (it.hasNext())
            aux += it.next().indiceDefensa();
        return aux;
    }

    public double indiceAtaque() {
        Iterator<Jugador> it = this.getJugadores();
        double aux = 0;
        while (it.hasNext())
            aux += it.next().indiceAtaque();
        return aux;
    }
}
