public class Intermedio extends EmpleadoPermanente {
    public Intermedio(String nombre, String domicilio) {
        super(nombre, domicilio);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * (1.25 + this.antiguedad / 100.0);
    }

}
