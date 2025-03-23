import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String telefono;
    private String email;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal(Pedido pedido) {
        double acumulador = 0;
        ArrayList<LineaDePedido> lineas = pedido.getLineasDePedidos();
        if (pedido.getResponsable() == this) {
            for (LineaDePedido lineaDePedido : lineas)
                acumulador += lineaDePedido.getProducto().getPrecioUnitario() * lineaDePedido.getCantidad();
            return acumulador;
        } else
            return -1;
    }
}