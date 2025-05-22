package Ejercicio1.Vista;

public interface IVista {
    // Comandos
    public static String ATACAR = "atacar";
    public static String CREAR_ARQUERO = "nuevo_arquero";
    public static String CREAR_GUERRERO = "nuevo_guerrero";
    public static String CREAR_CABALLERO = "nuevo_caballero";
    public static String MOVER = "mover";

    public void getNombre();

    public double getIncX();

    public double getIncY();
}
