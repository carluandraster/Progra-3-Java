package Ejercicio9;

public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        if (puntaje > 0)
            this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
