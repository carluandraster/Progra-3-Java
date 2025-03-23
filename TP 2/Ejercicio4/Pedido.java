import java.util.ArrayList;

public class Pedido {
    private Empleado responsable;
    private String fecha;
    private ArrayList<LineaDePedido> lineasDePedidos = new ArrayList<>();

    public Pedido(String fecha) {
        this.fecha = fecha;
    }

    public void agregarLineaDePedido(LineaDePedido nuevaLinea) {
        this.lineasDePedidos.add(nuevaLinea);
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LineaDePedido> getLineasDePedidos() {
        return lineasDePedidos;
    }
}
