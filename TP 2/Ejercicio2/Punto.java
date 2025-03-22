public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void cambia(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    public String cartel() {
        return "Punto[x=" + x + ",y=" + y + "]";
    }
}
