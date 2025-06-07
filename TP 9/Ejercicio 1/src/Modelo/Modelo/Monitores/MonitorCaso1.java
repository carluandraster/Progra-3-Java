package Modelo.Monitores;

public class MonitorCaso1 {
    private boolean ocupado = false;

    // Método llamado por un tren cuando quiere entrar
    public synchronized void entrar(String nombreTren) {
        while (this.ocupado) {
            try {
                System.out.println(nombreTren + " espera a que se libere la vía.");
                wait(); // se bloquea hasta que la vía esté libre
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        this.ocupado = true;
        System.out.println(nombreTren + " entra a la vía.");
    }

    // Método llamado por un tren cuando sale
    public synchronized void salir(String nombreTren) {
        this.ocupado = false;
        System.out.println(nombreTren + " sale de la vía.");
        notify(); // despierta a un tren esperando
    }
}
