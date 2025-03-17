package Ejercicio3;

public class Categoria {
    private String nombrecategoria;
    private double sueldoporhora;

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public double getSueldoporhora() {
        return sueldoporhora;
    }

    public Categoria(String nombrecategoria, double sueldoporhora) {
        this.nombrecategoria = nombrecategoria;
        this.sueldoporhora = sueldoporhora;
    }
}
