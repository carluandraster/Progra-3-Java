public abstract class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    protected int antiguedad;

    public EmpleadoPermanente(String nombre, int nroLegajo, String domicilio) {
        super(nombre, nroLegajo, domicilio);
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public double getSueldo() {
        return sueldoBase * 0.83;
    }
}
