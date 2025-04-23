
public abstract class Personaje implements Movible {
    private String nombre;
    protected int vitalidad;
    private Posicion posicion;
    protected double alcance;
    protected int danio;
    private double distanciaMaximaDeDeplazamiento;

    public Personaje(String nombre, double distanciaMaximaDeDeplazamiento) {
        this.nombre = nombre;
        this.posicion = new Posicion(0, 0); // Todos los personajes se generan en el spawn
        this.distanciaMaximaDeDeplazamiento = distanciaMaximaDeDeplazamiento;
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
    public void incrementaPos(double incX, double incY) throws IncrementoImposibleException {
        double distancia = Math.sqrt(Math.pow(incX, 2) + Math.pow(incY, 2));
        if (distancia > this.distanciaMaximaDeDeplazamiento) {
            throw new IncrementoImposibleException(this.distanciaMaximaDeDeplazamiento, distancia);
        } else {
            this.posicion.incrementaPos(incX, incY);
        }

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
    public double distancia(Movible movible) {
        return this.posicion.distancia(movible);
    }
}
