/*
 * TransportePersonas engloba a los autos y la combis
 */
public abstract class TransportePersonas extends Vehiculo {
    private int cantidadPlazas;
    private double incrementoPorPlaza;

    public TransportePersonas(String patente, int cantidadPlazas, double incrementoPorPlaza) {
        super(patente);
        this.cantidadPlazas = cantidadPlazas;
        this.incrementoPorPlaza = incrementoPorPlaza;
    }

    /*
     * Precio = precioBase * incrementoxPlaza * cantidadPlazas * cantidadDias
     */
    @Override
    public double getPrecio(int cantDias) {
        return Vehiculo.precioBase * this.incrementoPorPlaza * this.cantidadPlazas * cantDias;
    }
}
