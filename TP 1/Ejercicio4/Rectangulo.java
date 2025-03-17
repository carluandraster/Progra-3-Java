package Ejercicio4;

public class Rectangulo {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangulo() {
        this.x1 = -1;
        this.y1 = -1;
        this.x2 = 1;
        this.y2 = 1;
    }

    public Rectangulo(int ancho, int alto) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = ancho;
        this.y2 = alto;
    }

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int alto() {
        return this.y2 - this.y1;
    }

    public int ancho() {
        return this.x2 - this.x1;
    }

    public int area() {
        return this.ancho() * this.alto();
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int perimetro() {
        return 2 * (this.ancho() + this.alto());
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
