package com;

import com.Controlador.Controlador;
import com.Modelo.Calculadora;
import com.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        new Controlador(new Calculadora(), new Ventana());
    }
}