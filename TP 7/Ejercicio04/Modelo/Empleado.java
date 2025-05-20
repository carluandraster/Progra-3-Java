package Ejercicio04.Modelo;

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
        return pedido.getTotal();
    }
}