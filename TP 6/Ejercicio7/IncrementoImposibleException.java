public class IncrementoImposibleException extends Exception {
    private double maxDistanciaSoportada;
    private double distanciaPretendida;

    public IncrementoImposibleException(double maxDistanciaSoportada, double distanciaPretendida) {
        super("Se quiso mover al personaje a una distancia de " + distanciaPretendida
                + " pero el personaje puede desplazarse " + maxDistanciaSoportada + " como mucho");
        this.maxDistanciaSoportada = maxDistanciaSoportada;
        this.distanciaPretendida = distanciaPretendida;
    }

    public void setMaxDistanciaSoportada(double maxDistanciaSoportada) {
        this.maxDistanciaSoportada = maxDistanciaSoportada;
    }

    public void setDistanciaPretendida(double distanciaPretendida) {
        this.distanciaPretendida = distanciaPretendida;
    }

    public double getMaxDistanciaSoportada() {
        return maxDistanciaSoportada;
    }

    public double getDistanciaPretendida() {
        return distanciaPretendida;
    }

}
