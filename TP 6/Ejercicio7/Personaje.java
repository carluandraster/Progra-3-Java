
public abstract class Personaje implements Movible, Comparable<Personaje>, Cloneable {
    private String nombre;
    protected int vitalidad;
    protected Posicion posicion;
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

    public void ataca(Personaje personaje) throws AtaqueImposibleException{
        if (this.validarDistancia(personaje.posicion)) {
            this.daniar(personaje);
        } else {
            throw new AtaqueImposibleException(this,personaje);
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

    @Override
    public int compareTo(Personaje o) {
        int aux = this.nombre.compareTo(o.nombre);
        if (aux == 0) {
            if (this.vitalidad < o.vitalidad) {
                aux = -1;
            } else {
                if (this.vitalidad == o.vitalidad) {
                    aux = 0;
                } else {
                    aux = 1;
                }
            }
        }
        return aux;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Personaje aux;
        try {
            aux = (Personaje)super.clone();
            aux.posicion = (Posicion)this.posicion.clone();
            return aux;
        } catch (CloneNotSupportedException e) {
            System.err.println("No se puede clonar este personaje porque tiene una posicion no cloneable");
            throw new InternalError(e.toString());
        }
    }
}
