package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;

public interface InterfazInscripcion extends InterfazGrafica {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("agregar", "volverDeInscripcion"));

    public String getNombre();

    public int getDNI();

    public String getDomicilio();
}
