package Ejercicio3.Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public interface IFormulario {
    public static ArrayList<String> comandos = new ArrayList<>(Arrays.asList("agregar", "consultar"));

    public String getApellido();

    public String getNombre();

    public String getDireccion();

    public void setActionListener(ActionListener al);

    public void reset();
}
