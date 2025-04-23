public interface Movible {
    public double getPosx();

    public double getPosy();

    public void incrementaPos(double valorX, double valorY) throws IncrementoImposibleException;

    public double distancia(Movible movible);

}
