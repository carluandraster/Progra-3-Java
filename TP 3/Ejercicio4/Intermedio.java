public class Intermedio extends EmpleadoPermanente {
    public Intermedio(String nombre, int nroLegajo, String domicilio) {
        super(nombre, nroLegajo, domicilio);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * (1.25 + this.antiguedad / 100.0);
    }

}
