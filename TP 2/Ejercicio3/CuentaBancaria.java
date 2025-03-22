public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public boolean extraer(double monto) {
        if (monto < 0 || monto > this.saldo)
            return false;
        else {
            this.saldo -= monto;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}