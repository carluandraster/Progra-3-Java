package Ejercicio8;

import java.util.ArrayList;

public class Resultado extends Partido{
    int[] cantGoles = new int[2];
    ArrayList<ArrayList<Jugador>> autores;

    public Resultado(Partido partido){
        super(partido.equipos, partido.fecha);
        this.cantGoles[0] = this.cantGoles[1] = 0;
        this.autores = new ArrayList<ArrayList<Jugador>>();
    }
}
