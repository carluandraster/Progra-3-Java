package Ejercicio6;

public class Club {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularCuota(Socio socio){
        double cuota = 500;
        if (socio.getEdad()>65) {
            return cuota*0.5;
        }
        else {
            if (socio.getEdad()<18 && socio.isReprClub()) {
                return cuota*0.75;
            } else {
                return cuota;
            }
        }
    }
}
