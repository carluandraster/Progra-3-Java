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
    public boolean validaExtraccion(double monto) {
        return super.validaExtraccion(monto) && this.saldo - monto >= -topeDeuda;
    }
}
