package Ejercicio4;

import Ejercicio4.b.*;

public class Prueba {
    public static void main(String[] args) {
        ConjuntoNumeros c = new ConjuntoNumeros("Mi conjunto", 10);
        ConjuntoNumeros d;
        c.getCelda()[0] = new Numero(1);
        c.getCelda()[1] = new Numero(1);
        c.getCelda()[2] = new Numero(2);
        c.getCelda()[3] = new Numero(3);
        c.getCelda()[4] = new Numero(5);
        c.getCelda()[5] = new Numero(8);
        c.getCelda()[6] = new Numero(13);
        c.getCelda()[7] = new Numero(21);
        c.getCelda()[8] = new Numero(34);
        c.getCelda()[9] = new Numero(55);
        try {
            d = (ConjuntoNumeros) c.clone();
            d.getCelda()[9] = new Numero(-1);
            System.out.println(c);
            System.out.println(d);
        } catch (CloneNotSupportedException e) {
            System.err.println(e.toString());
        }
    }

}
