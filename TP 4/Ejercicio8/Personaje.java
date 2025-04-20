package Ejercicio8;

public abstract class Personaje {
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
        return this.posicion.distancia(posicion) < alcance;
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

    public void mueve(double incX, double incY) {
        this.posicion.incrementaPos(incX, incY);
    }
}
