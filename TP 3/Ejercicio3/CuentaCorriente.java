public class CuentaCorriente extends CuentaBancaria {
    private double topeDeuda;

    public CuentaCorriente(String titular, double topeDeuda) {
        super(titular);
        this.topeDeuda = topeDeuda;
    }

    public double getTopeDeuda() {
        return topeDeuda;
    }

    public void setTopeDeuda(double topeDeuda) {
        this.topeDeuda = topeDeuda;
    }

    @Override
    public boolean extraer(double monto) {
        if (this.saldo - monto < -topeDeuda)
            return false;
        else {
            this.saldo -= monto;
            return true;
        }
    }

}
