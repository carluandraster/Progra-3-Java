package Ejercicio3;

public class FaltaCombustibleException extends CargaInvalidaException {
    public FaltaCombustibleException(String mensaje, String combustible, double cantidadRequerida,
            double cantidadDisponible) {
        super(mensaje, combustible, cantidadRequerida, cantidadDisponible);
    }
}
