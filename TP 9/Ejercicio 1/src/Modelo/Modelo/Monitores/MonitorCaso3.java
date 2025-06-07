package Modelo.Monitores;

public class MonitorCaso3 {
    private int trenesCirculando = 0;
    private boolean sentido;

    // Método llamado por un tren cuando quiere entrar
    public synchronized void entrar(String nombreTren, boolean sentido) {
        if (this.trenesCirculando == 0)
            this.sentido = sentido;
        while (this.sentido != sentido) {
            try {
                System.out.println(nombreTren + " espera a que se libere la vía.");
                wait(); // se bloquea hasta que la vía esté libre
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        this.trenesCirculando++;
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
