package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;

public interface ICrearLlamado extends InterfazGrafica {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("enviar", "volverDeCrear"));

    public int getDNI();

    public int getPrioridad();

    public void actualizar(Integer[] dnis);
}
