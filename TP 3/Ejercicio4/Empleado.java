public abstract class Empleado {
    private String nombre;
    private int nroLegajo;
    private String domicilio;

    public Empleado(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public abstract double getSueldo();

    @Override
    public String toString() {
        return this.nombre + "\t$" + this.getSueldo() + "\n";
    }
}
