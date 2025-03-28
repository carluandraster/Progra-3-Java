public class CuentaUniversitaria extends CuentaBancaria {
    private static double maxExtaccionDiaria = 1000;
    private double dineroExtraido;

    public CuentaUniversitaria(String titular) {
        super(titular);
        this.dineroExtraido = 0;
    }

    @Override
    public boolean extraer(double monto) {
        if (monto <= 0 || this.dineroExtraido + monto > maxExtaccionDiaria || monto > this.saldo)
            return false;
        else {
            this.saldo -= monto;
            this.dineroExtraido += monto;
            return true;
        }
    }

    public double getDineroExtraido() {
        return dineroExtraido;
    }

    public void resetDineroExtraido() {
        this.dineroExtraido = 0;
    }

}
