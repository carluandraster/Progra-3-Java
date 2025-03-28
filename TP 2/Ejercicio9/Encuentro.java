package Ejercicio9;

import java.util.GregorianCalendar;

public class Encuentro {
    protected GregorianCalendar fecha;
    protected Equipo equipo1;
    protected Equipo equipo2;

    public Encuentro(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo(int equipo) {
        if (equipo == 1)
            return equipo1;
        else if (equipo == 2)
            return equipo2;
        else
            return null;
    }

    public boolean asignarEquipo(Jugador jugador, int equipo) {
        switch (equipo) {
            case 1:
                if (this.equipo2.getJugadores().contains(jugador))
                    return false;
                else {
                    this.equipo1.agregarJugador(jugador);
                    return true;
                }

            case 2:
                if (this.equipo1.getJugadores().contains(jugador))
                    return false;
                else {
                    this.equipo2.agregarJugador(jugador);
                    return true;
                }

            default:
                return false;
        }
    }

    public void desasignarEquipo(Jugador jugador, int equipo) {
        switch (equipo) {
            case 1:
                this.equipo1.quitarJugador(jugador);
                break;
            case 2:
                this.equipo2.quitarJugador(jugador);
                break;
        }
    }

    public boolean validarEncuentro() {
        return this.equipo1.getJugadores().size() >= 4 && this.equipo2.getJugadores().size() >= 4;
    }
}
