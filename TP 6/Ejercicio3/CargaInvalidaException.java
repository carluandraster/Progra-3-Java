package Ejercicio3;

public class CargaInvalidaException extends Exception {
    private DatoCargaInvalido datoCargaInvalido;

    public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida,
            double cantidadDisponible) {
        super(mensaje);
        this.datoCargaInvalido = new DatoCargaInvalido(combustible, cantidadRequerida, cantidadDisponible);
    }

    public DatoCargaInvalido getDatoCargaInvalido() {
        return datoCargaInvalido;
    }
}
