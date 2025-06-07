package com;

import com.Modelo.Mascota;
import com.Vista.*;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Consola c = new Consola();
        Ventana v = new Ventana();

        Mascota m1 = new Mascota("Michi", c);
        m1.addObserver(v);

        Mascota m2 = new Mascota("Roxy", c);
        m2.addObserver(v);

        Mascota m3 = new Mascota("Cerbelo", c);
        m3.addObserver(v);

        Mascota m4 = new Mascota("Cleopatra", c);
        m4.addObserver(v);

        new Thread(m1).start();
        new Thread(m2).start();
        new Thread(m3).start();
        new Thread(m4).start();
    }
}