public class CajaDeAhorro extends CuentaBancaria {
    private static int maxExtracciones = 30;
    private int extraccionesMensuales;

    public CajaDeAhorro(String titular) {
        super(titular);
        this.extraccionesMensuales = 0;
    }

    @Override
    public boolean extraer(double monto) {
        if (monto <= 0 || this.extraccionesMensuales == maxExtracciones || monto > this.saldo)
            return false;
        else {
            this.saldo -= monto;
            this.extraccionesMensuales++;
            return true;
        }
    }

    public int getExtraccionesMensuales() {
        return extraccionesMensuales;
    }

    public void resetExtraccionesMensuales() {
        this.extraccionesMensuales = 0;
    }

}
