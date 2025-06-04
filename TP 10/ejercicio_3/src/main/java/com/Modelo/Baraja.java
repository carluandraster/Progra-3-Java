package com.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Baraja {
    private Stack<Carta> cartas;

    public Baraja(){
        int nroCarta;
        Carta nuevaCarta;
        ArrayList<Carta> cartas = new ArrayList<>(Arrays.asList(
            new Carta(1, 4),
            new Carta(2, 4),
            new Carta(3, 4),
            new Carta(4, 4),
            new Carta(5, 4),
            new Carta(6, 4),
            new Carta(7, 4),
            new Carta(8, 4),
            new Carta(9, 4),
            new Carta(10, 16)));

        this.cartas = new Stack<>();
        for (int i = 0; i < 52; i++) {
            do {
                nroCarta = (int) Math.round(Math.random()*9);
                nuevaCarta = cartas.get(nroCarta);
            } while (nuevaCarta.getApariciones() == 0);
            this.cartas.push(nuevaCarta);
        }
    }

    
}
