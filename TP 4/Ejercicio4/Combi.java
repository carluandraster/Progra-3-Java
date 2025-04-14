/*
 * Una combi representa un Vehiculo de tipo combi
 */
public class Combi extends TransportePersonas {
    /*
     * Incremento por plaza: 2%
     */
    public Combi(String patente, int cantidadPlazas) {
        super(patente, cantidadPlazas, 1.02);
    }

    /*
     * Además, especifica que es una combi
     */
    @Override
    public String toString() {
        return "Combi" + super.toString();
    }
}
