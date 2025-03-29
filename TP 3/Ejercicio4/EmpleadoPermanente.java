public abstract class EmpleadoPermanente extends Empleado {
    protected double sueldoBase;
    protected int antiguedad;

    public EmpleadoPermanente(String nombre, String domicilio) {
        super(nombre, domicilio);
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
