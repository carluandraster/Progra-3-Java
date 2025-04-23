public class DepositoInvalidoException extends Exception {
    private double cantidadInvalida;

    public DepositoInvalidoException(double cantidadInvalida) {
        super("La cantidad $" + cantidadInvalida + " no es valida");
        this.cantidadInvalida = cantidadInvalida;
    }

    public double getCantidadInvalida() {
        return cantidadInvalida;
    }

}
