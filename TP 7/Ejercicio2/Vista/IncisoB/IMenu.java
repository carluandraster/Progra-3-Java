package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;

public interface IMenu extends InterfazGrafica {
    public static ArrayList<String> comandos = new ArrayList<>(
            Arrays.asList("inscribir", "registrar", "atender", "estadisticas"));
}
