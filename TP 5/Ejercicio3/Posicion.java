public class Posicion {
    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void incrementaPos(int valorX, int valorY) {
        this.x += valorX;
        this.y += valorY;
    }

    public double distancia(Posicion otraPosicion) {
        return Math.sqrt(Math.pow(otraPosicion.x - this.x, 2) + Math.pow(otraPosicion.y - this.y, 2));
    }
}
