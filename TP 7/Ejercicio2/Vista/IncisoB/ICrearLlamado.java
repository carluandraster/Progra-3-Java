package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;

public interface ICrearLlamado {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("enviar", "volver"));

    public void setActionListener(ActionListener al);

    public int getDNI();

    public int getPrioridad();
}
