package Ejercicio8;

public class Posicion {
    private double x;
    private double y;

    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void incrementaPos(double valorX, double valorY) {
        this.x += valorX;
        this.y += valorY;
    }

    public double distancia(Posicion otraPosicion) {
        return Math.sqrt(Math.pow(otraPosicion.x - this.x, 2) + Math.pow(otraPosicion.y - this.y, 2));
    }
}
