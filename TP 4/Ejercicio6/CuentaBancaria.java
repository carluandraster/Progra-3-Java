public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if (monto <= 0)
            return false;
        else {
            this.saldo += monto;
            return true;
        }
    }

    public boolean validaExtraccion(double monto) {
        return monto > 0;
    }

    public boolean extraer(double monto) {
        if (this.validaExtraccion(monto)) {
            this.saldo -= monto;
            return true;
        } else
            return false;
    }
}