package Ejercicio5.Choferes;

import Ejercicio5.Vehiculos.Vehiculo;

public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;
    private Vehiculo vehiculo = null;

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo.aceptoChofer(this))
            this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        if (this.vehiculo == null) {
            return "Nombre: " + this.nombre + "\n" +
                    "Domicilio: " + this.domicilio + "\n" +
                    "Categoria: " + this.categoria.getNombrecategoria() + "\n" +
                    "Ningun Vehiculo asignado\n";
        } else
            return "Nombre: " + this.nombre + "\n" +
                    "Domicilio: " + this.domicilio + "\n" +
                    "Categoria: " + this.categoria.getNombrecategoria() + "\n" +
                    "Vehiculo asignado numero " + this.vehiculo.getNumerointerno() + "\n";
    }
}
