package Ejercicio04.Vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;

public interface IFormulario {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("agregar", "terminar"));

    public String getNombreProducto();

    public int getCantidad();

    public void setActionListener(ActionListener al);

    public void reset();
}
