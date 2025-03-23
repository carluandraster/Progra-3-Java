public class Producto {
    private int nroCodigo;
    private String descripcion;
    private double precioUnitario;

    public Producto(int nroCodigo, String descripcion, double precioUnitario) {
        this.nroCodigo = nroCodigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
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
}
