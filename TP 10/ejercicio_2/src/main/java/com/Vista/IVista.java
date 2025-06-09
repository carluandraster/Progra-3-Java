package com.Vista;

import java.awt.event.ActionListener;

public interface IVista {
    // Dígitos
    public static String CERO = "0";
    public static String UNO = "1";
    public static String DOS = "2";
    public static String TRES = "3";
    public static String CUATRO = "4";
    public static String CINCO = "5";
    public static String SEIS = "6";
    public static String SIETE = "7";
    public static String OCHO = "8";
    public static String NUEVE = "9";

    // Operaciones
    public static String MAS = "+";
    public static String MENOS = "-";
    public static String POR = "*";
    public static String DIVIDIR = "/";

    // Otros comandos
    public static String COMA = ".";
    public static String IGUAL = "=";
    public static String CE = "CE";

    // Métodos
    public void setActionListener(ActionListener al);

    public void escribirCaracter(char c);

    public void limpiarPantalla();

    public void escribirOutput(String mensaje);
}
