package Ejercicio1.Vista;

import java.awt.event.ActionListener;

import Ejercicio1.Modelo.Personaje;

public interface IVista {
    // Comandos
    public static String ATACAR = "atacar";
    public static String CREAR_ARQUERO = "nuevo_arquero";
    public static String CREAR_GUERRERO = "nuevo_guerrero";
    public static String CREAR_CABALLERO = "nuevo_caballero";
    public static String CREAR_MAGO = "nuevo_mago";
    public static String MOVER = "mover";

    public String getNombre();

    public double getIncX();

    public double getIncY();

    public Personaje getAtacante();

    public Personaje getAtacado();

    public void actualizar(Personaje personajes[]);

    public void setActionListener(ActionListener al);
}
