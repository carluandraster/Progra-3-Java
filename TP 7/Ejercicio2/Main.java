package Ejercicio2;

import Ejercicio2.Modelo.*;
import Ejercicio2.Controladores.*;
import Ejercicio2.Vista.*;

public class Main {
    public static void main(String[] args) {
        new Controlador(new ListaConPrioridades<>(), new Ventana());
    }
}
