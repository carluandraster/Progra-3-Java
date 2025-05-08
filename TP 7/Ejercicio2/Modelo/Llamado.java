package Ejercicio2.Modelo;

import java.util.GregorianCalendar;

public class Llamado implements Comparable<Llamado>{
    private GregorianCalendar fechahoraAtendido;
    private GregorianCalendar fechahoraPedido;
    private int prioridad;
    private Socio socio;
    
    public Llamado(int prioridad, Socio socio) {
        this.fechahoraAtendido = null;
        this.fechahoraPedido = new GregorianCalendar();
        this.prioridad = prioridad;
        this.socio = socio;
    }

    /**
     * Compara tiempo de espera. A mayor prioridad, menor debe ser el tiempo de espera
     */
    @Override
    public int compareTo(Llamado o) {
        int aux;
        if (this.prioridad < o.prioridad) {
            // this > o si this es de menor prioridad
            aux = 1;
        } else {
            if (this.prioridad > o.prioridad) {
                // this < o si this es de mayor prioridad
                aux = -1;
            } else {
                // Cuanto antes hayas llamado, menor debe ser el tiempo de espera
                aux = this.fechahoraPedido.compareTo(o.fechahoraPedido);
            }
        }
        return aux;
    }

    public GregorianCalendar getFechahoraAtendido() {
        return fechahoraAtendido;
    }

    public GregorianCalendar getFechahoraPedido() {
        return fechahoraPedido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setFechahoraAtendido(GregorianCalendar fechahoraAtendido) {
        this.fechahoraAtendido = fechahoraAtendido;
    }

    @Override
    public String toString() {
        return "Llamado [fechahoraAtendido=" + fechahoraAtendido + ", fechahoraPedido=" + fechahoraPedido
                + ", prioridad=" + prioridad + ", socio=" + socio + "]";
    }
}
