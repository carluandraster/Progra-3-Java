package Ejercicio2.Vista;

import java.awt.event.ActionListener;

public interface IVista {
    public static String AGREGAR_LLAMADO = "agregar_llamado";
    public static String OBTENER_LLAMADO = "obtener_llamado";
    public void setActionListener(ActionListener al);
}
