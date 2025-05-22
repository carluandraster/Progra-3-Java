package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;

public interface IEstadisticas extends InterfazGrafica {
    public static String BUSCAR = "buscar";
    public static ArrayList<String> comandos = new ArrayList<>(
            Arrays.asList("obtener listado", "volverDeEstadisticas"));

    public int getDNI();

    public void actualizar(Integer[] array);
}
