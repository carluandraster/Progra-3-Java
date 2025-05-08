package Ejercicio2.Modelo;

public class Socio {
    private int dni;
    private String domicilio;
    private String nombre;
    
    public Socio() {
        super();
    }

    public Socio(int dni, String nombre, String domicilio) {
        this.dni = dni;
        this.domicilio = domicilio;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio [dni=" + dni + ", domicilio=" + domicilio + ", nombre=" + nombre + "]";
    }
}
