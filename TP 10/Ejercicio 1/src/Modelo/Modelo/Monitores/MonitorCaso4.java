package Modelo.Monitores;

public class MonitorCaso4 {
    private int trenesCirculando = 0;
    private boolean sentido;
    private boolean esperandoT = false;
    private boolean esperandoF = false;

    // Método llamado por un tren cuando quiere entrar
    public synchronized void entrar(String nombreTren, boolean sentido) {
        if (this.trenesCirculando == 0)
            this.sentido = sentido;
        /*
         * Este ciclo corta cuando
         * - los sentidos coincidan,
         * - el sentido true implique que nadie esté esperando desde el lado false y
         * - el sentido false implique que nadie esté esperando desde el lado true
         */
        while (this.sentido != sentido || this.sentido && this.esperandoF || !this.sentido && this.esperandoT) {
            try {
                System.out.println(nombreTren + " espera a que se libere la vía.");
                if (this.sentido) {
                    this.esperandoT = true;
                } else {
                    this.esperandoF = true;
                }
                wait(); // se bloquea hasta que la vía esté libre
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        this.trenesCirculando++;
        if (this.sentido) {
            this.esperandoT = false;
        } else {
            this.esperandoF = false;
        }
        System.out.println(nombreTren + " entra a la vía.");
    }

    // Método llamado por un tren cuando sale
    public synchronized void salir(String nombreTren) {
        this.trenesCirculando--;
        if (this.trenesCirculando == 0) {
            this.sentido = !this.sentido;
        }
        System.out.println(nombreTren + " sale de la vía.");
        notifyAll(); // despierta a todos los trenes esperando
    }
}
