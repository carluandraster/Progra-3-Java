public class CuentaUniversitaria extends CuentaBancaria {
    private static double maxExtaccionDiaria = 1000;
    private double dineroExtraido;

    public CuentaUniversitaria(String titular) {
        super(titular);
        this.dineroExtraido = 0;
    }

    @Override
    public boolean validaExtraccion(double monto) {
        if (super.validaExtraccion(monto) && this.dineroExtraido + monto <= maxExtaccionDiaria
                && monto <= this.saldo) {
            this.dineroExtraido += monto;
            return true;
        } else
            return false;
    }

    public double getDineroExtraido() {
        return dineroExtraido;
    }

    public void resetDineroExtraido() {
        this.dineroExtraido = 0;
    }

}
