public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double cantidad) throws DepositoInvalidoException {
        if (cantidad <= 0) {
            throw new DepositoInvalidoException(cantidad);
        } else {
            this.saldo += cantidad;
        }
    }

    public void extraer(double cantidad) throws ExtraccionInvalidaException {
        if (cantidad >= 0 || -cantidad > this.saldo) {
            throw new ExtraccionInvalidaException(new Dato_Extraccion_Invalido(this.saldo, cantidad));
        } else {
            this.saldo += cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}
