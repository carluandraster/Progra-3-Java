public class Principiante extends EmpleadoPermanente {
    public Principiante(String nombre, int nroLegajo, String domicilio) {
        super(nombre, nroLegajo, domicilio);
    }

    @Override
    public double getSueldo() {
        if (this.antiguedad < 10)
            if (this.antiguedad < 5)
                if (this.antiguedad < 2)
                    return super.getSueldo();
                else
                    return super.getSueldo() * 1.05;
            else
                return super.getSueldo() * 1.07;
        else if (this.antiguedad < 15)
            return super.getSueldo() * 1.1;
        else if (this.antiguedad < 20)
            return super.getSueldo() * 1.15;
        else
            return super.getSueldo() * 1.2;
    }
}
