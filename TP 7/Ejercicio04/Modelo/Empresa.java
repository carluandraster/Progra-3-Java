package Ejercicio04.Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Empresa {
    private static Empresa _instancia = null;
    private ArrayList<Empleado> personal = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private HashMap<String, Producto> productos = new HashMap<>();

    private Empresa() {
        super();
    }

    public static Empresa get_instancia() {
        if (_instancia == null) {
            _instancia = new Empresa();
        }
        return _instancia;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.personal.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        this.personal.remove(empleado);
    }

    public ArrayList<Empleado> getPersonal() {
        return personal;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void cancelarPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.put(producto.getDescripcion(), producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto.getDescripcion());
    }

    public HashMap<String, Producto> getProductos() {
        return productos;
    }
}