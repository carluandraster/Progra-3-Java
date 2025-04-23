package Ejercicio3;

public class DatoCargaInvalido {
    private String combustible;
    private double cantidadRequerida;
    private double cantidadDisponible;

    public DatoCargaInvalido(String combustible, double cantidadRequerida, double cantidadDisponible) {
        this.combustible = combustible;
        this.cantidadRequerida = cantidadRequerida;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCombustible() {
        return combustible;
    }

    public double getCantidadRequerida() {
        return cantidadRequerida;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

}
