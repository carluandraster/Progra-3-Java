package Ejercicio2.Vista.IncisoB;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;

public interface InterfazInscripcion {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("agregar", "volverDeInscripcion"));

    public void setActionListener(ActionListener al);

    public String getNombre();

    public int getDNI();

    public String getDomicilio();
}
