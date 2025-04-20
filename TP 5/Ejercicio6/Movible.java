public interface Movible {
    public double getPosx();

    public double getPosy();

    public void setXY(double x, double y);

    public void incrementaPos(double valorX, double valorY);

    public double distancia(Movible movible);

}
