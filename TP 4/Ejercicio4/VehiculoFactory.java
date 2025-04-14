/*
 * VehiculoFactory se encarga de instanciar vehiculos de distintos tipos
 */
public class VehiculoFactory {
    private static VehiculoFactory _instancia = null;

    private VehiculoFactory() {
    }

    /*
     * Patrón Singleton
     */
    public VehiculoFactory getInstancia() {
        if (_instancia == null)
            return new VehiculoFactory();
        else
            return _instancia;
    }

    /*
     * Crea un camion
     */
    public Camion getVehiculo(String tipoVehiculo, String patente) {
        if (tipoVehiculo == null)
            return null;
        if (tipoVehiculo.equalsIgnoreCase("CAMION"))
            return new Camion(patente);
        else
            return null;
    }

    /*
     * Crea una combi o un auto
     */
    public TransportePersonas getVehiculo(String tipoVehiculo, String patente, int cantidadPlazas) {
        if (tipoVehiculo == null)
            return null;
        if (tipoVehiculo.equalsIgnoreCase("AUTO"))
            return new Auto(patente, cantidadPlazas);
        else if (tipoVehiculo.equalsIgnoreCase("COMBI"))
            return new Combi(patente, cantidadPlazas);
        else
            return null;
    }

    /*
     * Crea una camioneta de carga
     */
    public CamionetaDeCarga getVehiculo(String tipoVehiculo, String patente, double PMA) {
        if (tipoVehiculo == null)
            return null;
        if (tipoVehiculo.equalsIgnoreCase("CAMIONETA DE CARGA"))
            return new CamionetaDeCarga(patente, PMA);
        else
            return null;
    }
}
