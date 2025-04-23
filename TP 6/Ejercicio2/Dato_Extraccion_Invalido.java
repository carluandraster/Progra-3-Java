public class Dato_Extraccion_Invalido {
    private double extraccion_solicitada;
    private double saldo;

    public Dato_Extraccion_Invalido(double saldo, double extraccion_solicitada) {
        this.extraccion_solicitada = extraccion_solicitada;
        this.saldo = saldo;
    }

    public double getExtraccion_solicitada() {
        return extraccion_solicitada;
    }

    public double getSaldo() {
        return saldo;
    }

}
