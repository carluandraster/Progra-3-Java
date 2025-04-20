
public abstract class Personaje implements Movible {
    private String nombre;
    protected int vitalidad;
    private Posicion posicion;
    protected double alcance;
    protected int danio;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.posicion = new Posicion(0, 0); // Todos los personajes se generan en el spawn
    }

    public String getNombre() {
        return nombre;
    }

    public boolean ataca(Personaje personaje) {
        if (this.validarDistancia(personaje.posicion)) {
            this.daniar(personaje);
            return true;
        } else {
            return false;
        }
    }

    protected boolean validarDistancia(Posicion posicion) {
        return this.distancia(posicion) < alcance;
    }

    protected void daniar(Personaje personaje) {
        personaje.recibeDanio(danio);
    }

    public void recibeDanio(int cantidad) {
        if (cantidad < this.vitalidad) {
            this.vitalidad -= cantidad;
        } else {
            this.vitalidad = 0;
            this.respawn();
        }
    }

    public void respawn() {
        this.posicion = new Posicion(0, 0);
    }

    @Override
    public void incrementaPos(double incX, double incY) {
        this.posicion.incrementaPos(incX, incY);
    }

    @Override
    public double getPosx() {
        return this.posicion.getPosx();
    }

    @Override
    public double getPosy() {
        return this.posicion.getPosy();
    }

    @Override
    public void setXY(double x, double y) {
        this.posicion.setXY(x, y);
    }

    @Override
    public double distancia(Movible movible) {
        return this.posicion.distancia(movible);
    }
}
