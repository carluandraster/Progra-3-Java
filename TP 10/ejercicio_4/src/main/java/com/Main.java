package com;

import com.Modelo.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        SocioFactory sf = new SocioFactory(biblioteca);
        Socio s1 = sf.crearSocio("Andrés Efstratiadis");
        Socio s2 = sf.crearSocio("Carlos Alejandro");
        Socio s3 = sf.crearSocio("Valentín Chiola");
        Socio s4 = sf.crearSocio("Fausto Finocchio");
        Socio s5 = sf.crearSocio("Valentín Verdi");
        Socio s6 = sf.crearSocio("Lucía Ochoa");
        Socio s7 = sf.crearSocio("Lucas Cardozo");
        Socio s8 = sf.crearSocio("Leandro Rondinara");
        Socio s9 = sf.crearSocio("Joaquín Cantarella");
        Socio s10 = sf.crearSocio("Rodrigo Emiliani");

        biblioteca.agregarLibro("El lenguaje de programación C");
        biblioteca.agregarLibro("Organización de computadoras: un enfoque estructurado");
        biblioteca.agregarLibro("Administración 13E");
        biblioteca.agregarLibro("JAVA 8 IN ACTION: lambdas, streams, and functional-style programming");
        biblioteca.agregarLibro("INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();
        s9.start();
        s10.start();
    }
}