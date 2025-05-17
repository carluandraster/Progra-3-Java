package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;

public interface IMenu {
    public static ArrayList<String> comandos = new ArrayList<>(
            Arrays.asList("inscribir", "registrar", "atender", "estadisticas"));

    public void setActionListener(ActionListener al);
}
