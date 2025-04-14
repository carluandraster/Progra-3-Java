/*
 * Vehiculo representa un vehiculo cualquiera
 */
public abstract class Vehiculo {
    protected static double precioBase = 500;
    private String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract double getPrecio(int cantDias);

    /**
     * Devuelve un string detallando patente y precio por dia
     */
    @Override
    public String toString() {
        return " patente: " + this.patente + "\n" +
                "Precio: " + this.getPrecio(1) + "por dia";
    }
}
