package Ejercicio5;

public class Categoria {
    private String nombrecategoria;
    private double sueldo;

    public Categoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }
}
