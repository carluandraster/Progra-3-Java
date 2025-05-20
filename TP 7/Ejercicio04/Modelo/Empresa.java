package Ejercicio04.Modelo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> personal = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}