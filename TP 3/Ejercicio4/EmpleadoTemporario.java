public class EmpleadoTemporario extends Empleado {
    private double sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporario(String nombre, String domicilio) {
        super(nombre, domicilio);
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSueldo() {
        return this.sueldoPorHora * this.horasTrabajadas;
    }

}
