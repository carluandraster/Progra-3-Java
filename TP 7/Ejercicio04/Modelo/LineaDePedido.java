package Ejercicio04.Modelo;

public class LineaDePedido implements Comparable<LineaDePedido> {
    private Producto producto;
    private int cantidad;

    public LineaDePedido() {
    }

    public LineaDePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0)
            this.cantidad = cantidad;
    }

    @Override
    public int compareTo(LineaDePedido o) {
        return this.cantidad - o.cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
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
        LineaDePedido other = (LineaDePedido) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return cantidad + " \t " + producto + " \t $"
                + Math.round(cantidad * producto.getPrecioUnitario() * 100) / 100.0;
    }

}
