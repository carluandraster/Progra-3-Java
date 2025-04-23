package Ejercicio5.b;

import Ejercicio5.a.Domicilio;

public class Prueba {
    public static void main(String[] args) {
        PersonaConMascota p1 = new PersonaConMascota("Andres", 12345678, new Domicilio("Avellaneda", 19345),
                new Gato("Michi", 20));
        PersonaConMascota p2 = new PersonaConMascota("Carlos", 99123987, new Domicilio("Piedras", 123),
                new Perro("Korky", 12));
        PersonaConMascota p3, p4;

        try {
            p3 = (PersonaConMascota) p1.clone();
            p4 = (PersonaConMascota) p2.clone();
            p3.getMascota().setNombre("Mandarina");
            System.out.println(p1.getMascota());
        } catch (CloneNotSupportedException e) {
            System.err.println(e.toString());
        }
    }
}
