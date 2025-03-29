public class Experto extends EmpleadoPermanente {
    public Experto(String nombre, int nroLegajo, String domicilio) {
        super(nombre, nroLegajo, domicilio);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * (1.5 + 1.5 * this.antiguedad / 100);
    }

}
