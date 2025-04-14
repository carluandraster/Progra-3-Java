/*
 * Auto representa a un vehiculo de tipo Auto
 */
public class Auto extends TransportePersonas {
    /*
     * Incremento por plaza: 1,5%
     */
    public Auto(String patente, int cantidadPlazas) {
        super(patente, cantidadPlazas, 1.015);
    }

    /*
     * Además, detalla que es un auto
     */
    @Override
    public String toString() {
        return "Auto" + super.toString();
    }
}
