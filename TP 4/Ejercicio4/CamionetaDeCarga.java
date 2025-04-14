/*
 * CamionetaDeCarga representa a los vehiculos de tipo camioneta
 */
public class CamionetaDeCarga extends Vehiculo {
    private double PMA;

    public CamionetaDeCarga(String patente, double pMA) {
        super(patente);
        PMA = pMA;
    }

    /*
     * Al precio base diario se lo incrementa un 20%*PMA (Peso Máximo Autorizado [en
     * toneladas])
     */
    @Override
    public double getPrecio(int cantDias) {
        return Vehiculo.precioBase * 1.2 * this.PMA * cantDias;
    }

    /*
     * Además, detalla que es una camioneta de carga
     */
    @Override
    public String toString() {
        return "Camioneta de carga" + super.toString();
    }
}
