package Ejercicio04.Modelo;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeSet;

import Ejercicio3.Modelo.ConjuntoGenericoOrdenado;

public class Pedido extends ConjuntoGenericoOrdenado<LineaDePedido> {
    private Empleado responsable;
    private GregorianCalendar fecha;

    public Pedido(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public void agregarLineaDePedido(LineaDePedido nuevaLinea) {
        this.elementos.add(nuevaLinea);
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public TreeSet<LineaDePedido> getLineasDePedidos() {
        return this.elementos;
    }

    public double getTotal() {
        double precioTotal = 0;
        Iterator<LineaDePedido> it = this.elementos.iterator();

        while (it.hasNext()) {
            LineaDePedido aux = it.next();
            precioTotal += aux.getCantidad() * aux.getProducto().getPrecioUnitario();
        }

        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cantidad \t Descripción \t Precio unitario \t Precio");
        Iterator<LineaDePedido> it = this.elementos.iterator();
        double precioTotal = 0;
        while (it.hasNext()) {
            LineaDePedido aux = it.next();
            sb.append("\n" + aux);
            precioTotal += aux.getCantidad() * aux.getProducto().getPrecioUnitario();
        }
        sb.append("\n\t\t\t\t\t\t\tTOTAL: $" + Math.round(precioTotal * 100) / 100.0);
        return sb.toString();
    }
}
