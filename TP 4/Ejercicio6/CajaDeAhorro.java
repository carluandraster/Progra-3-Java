public class CajaDeAhorro extends CuentaBancaria {
    private static int maxExtracciones = 30;
    private int extraccionesMensuales;

    public CajaDeAhorro(String titular) {
        super(titular);
        this.extraccionesMensuales = 0;
    }

    @Override
    public boolean validaExtraccion(double monto) {
        if (super.validaExtraccion(monto) && this.extraccionesMensuales + monto <= maxExtracciones
                && this.saldo >= monto) {
            this.extraccionesMensuales++;
            return true;
        } else
            return false;
    }

    public int getExtraccionesMensuales() {
        return extraccionesMensuales;
    }

    public void resetExtraccionesMensuales() {
        this.extraccionesMensuales = 0;
    }

}
