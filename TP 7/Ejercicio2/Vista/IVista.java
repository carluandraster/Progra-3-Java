package Ejercicio2.Vista;

import java.awt.event.ActionListener;

import Ejercicio2.Modelo.ListaConPrioridades;
import Ejercicio2.Modelo.Llamado;

public interface IVista {
    public static String AGREGAR_LLAMADO = "agregar_llamado";
    public static String ATENDER_LLAMADO = "atender_llamado";

    public void setActionListener(ActionListener al);
    
    public String getNombre();

    public int getDNI();

    public String getDomicilio();

    public int getPrioridad();

    public void actualizar(ListaConPrioridades<Llamado> cola);
}
