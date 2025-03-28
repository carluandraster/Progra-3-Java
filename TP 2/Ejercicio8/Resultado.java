package Ejercicio8;

import java.util.ArrayList;

public class Resultado extends Partido {
    int[] cantGoles = new int[2];
    ArrayList<ArrayList<Jugador>> autores;

    public Resultado(Partido partido) {
        super(partido.equipos, partido.fecha);
        this.cantGoles[0] = this.cantGoles[1] = 0;
        this.autores = new ArrayList<ArrayList<Jugador>>();
    }

    public int[] getCantGoles() {
        return cantGoles;
    }

    public ArrayList<ArrayList<Jugador>> getAutores() {
        return autores;
    }

    public boolean agregarGol(Gol gol) {
        if (this.equipos[0].getJugadores().containsValue(gol.getAutor())) {
            this.cantGoles[0]++;
            this.autores.get(0).add(gol.getAutor());
            return true;
        } else if (this.equipos[1].getJugadores().containsValue(gol.getAutor())) {
            this.cantGoles[1]++;
            this.autores.get(1).add(gol.getAutor());
            return true;
        } else
            return false;
    }

    private int minGoles() {
        if (this.cantGoles[0] <= this.cantGoles[1])
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int minIn = this.minGoles();
        int j;
        sb.append(this.equipos[0] + " " + this.cantGoles[0] + " - " + this.cantGoles[1] + " " + this.equipos[1] + "\n");
        for (j = 0; j < this.cantGoles[minIn]; j++)
            sb.append(this.autores.get(0).get(j) + "\t" + this.autores.get(1).get(j) + "\n");
        if (minIn == 0) {
            for (; j < this.cantGoles[1]; j++)
                sb.append(this.autores.get(0).get(j) + "\n");
        } else {
            for (; j < this.cantGoles[0]; j++)
                sb.append("\t" + this.autores.get(0).get(j) + "\n");
        }
        return sb.toString();
    }
}
