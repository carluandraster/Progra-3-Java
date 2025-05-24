package Ejercicio1.Modelo;

public class Posicion implements Movible, Cloneable {
    private double x;
    private double y;

    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getPosx() {
        return x;
    }

    @Override
    public double getPosy() {
        return y;
    }

    @Override
    public void incrementaPos(double valorX, double valorY) {
        this.x += valorX;
        this.y += valorY;
    }

    @Override
    public double distancia(Movible otroMovible) {
        return Math.sqrt(Math.pow(otroMovible.getPosx() - this.x, 2) + Math.pow(otroMovible.getPosy() - this.y, 2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
