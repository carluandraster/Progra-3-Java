public class ExtraccionInvalidaException extends Exception {
    private Dato_Extraccion_Invalido datoInvalido;

    public ExtraccionInvalidaException(Dato_Extraccion_Invalido datoInvalido) {
        super("Se quiso extraer $" + datoInvalido.getExtraccion_solicitada() + " a un saldo de $"
                + datoInvalido.getSaldo());
        this.datoInvalido = datoInvalido;
    }

    public Dato_Extraccion_Invalido getDatoInvalido() {
        return datoInvalido;
    }
}
