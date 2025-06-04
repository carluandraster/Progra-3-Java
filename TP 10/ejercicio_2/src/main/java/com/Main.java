package com;

import com.Modelo.*;

public class Main {
    public static void main(String[] args) {
        Monitor mostrador = new Monitor();

        new Persona("Andrés", 5, mostrador).start();;
        new Persona("Carlos", 3, mostrador).start();;
        new Persona("Juan", 2, mostrador).start();;
        new Persona("Ximena", 4, mostrador).start();;
        new Persona("Guille", 3, mostrador).start();;
    }
}