package Ejercicio8;

public class Gol {
    private Jugador autor;
    private Partido partido;

    public Gol(Jugador autor, Partido partido) {
        this.autor = autor;
        this.partido = partido;
    }

    public Jugador getAutor() {
        return autor;
    }

    public void setAutor(Jugador autor) {
        this.autor = autor;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
