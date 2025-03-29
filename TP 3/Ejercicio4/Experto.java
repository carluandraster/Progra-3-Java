public class Experto extends EmpleadoPermanente {
    public Experto(String nombre, String domicilio) {
        super(nombre, domicilio);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * (1.5 + 1.5 * this.antiguedad / 100);
    }

}
