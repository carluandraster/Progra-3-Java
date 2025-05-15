package Ejercicio2.Vista;

import java.awt.event.ActionListener;

public interface IVista {
    public static String AGREGAR_LLAMADO = "agregar_llamado";
    public static String ATENDER_LLAMADO = "atender_llamado";
    public void setActionListener(ActionListener al);
}
