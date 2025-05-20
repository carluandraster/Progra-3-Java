package Ejercicio04.Modelo;

public class Producto {
    private int nroCodigo;
    private String descripcion;
    private double precioUnitario;

    public Producto() {
    }

    public Producto(String descripcion, int nroCodigo, double precioUnitario) {
        this.nroCodigo = nroCodigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nroCodigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (nroCodigo != other.nroCodigo)
            return false;
        return true;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getNroCodigo() {
        return nroCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setNroCodigo(int nroCodigo) {
        this.nroCodigo = nroCodigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion + "\t$" + Math.round(precioUnitario * 100) / 100.0;
    }

}
