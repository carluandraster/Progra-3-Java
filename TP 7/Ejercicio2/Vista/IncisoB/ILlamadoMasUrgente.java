package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;

public interface ILlamadoMasUrgente extends InterfazGrafica {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("atender_llamado", "volver_de_atender"));

    public void actualizar();
}
