/*
 * Camion representa a los vehiculos de tipo Camion
 */
public class Camion extends Vehiculo {
    public Camion(String patente) {
        super(patente);
    }

    /*
     * Al precio base diario se le incrementa un 40%
     */
    @Override
    public double getPrecio(int cantDias) {
        return Vehiculo.precioBase * 1.4 * cantDias;
    }

    /*
     * Además, detalla que es un camion
     */
    @Override
    public String toString() {
        return "Camion" + super.toString();
    }
}
