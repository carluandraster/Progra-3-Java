public class Posicion {
    private double x;
    private double y;

    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Posicion(){
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void incrementaPosicion(double incX, double incY){
        this.x += incX;
        this.y += incY;
    }

    public double distancia(Posicion otra){
        double deltaX = otra.x - this.x;
        double deltaY = otra.y - this.y;
        double dist = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY, 2));
        return dist;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
