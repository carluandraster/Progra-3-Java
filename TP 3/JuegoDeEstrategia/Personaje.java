public abstract class Personaje {
    private String nombre;
    private Posicion posicion;
    protected int vitalidad;
    protected int danio;
    protected double alcance;
    

    public Personaje(String nombre, Posicion posicion, int vitalidad, int danio, double alcance) {
        super();
        this.nombre = nombre;
        this.posicion = posicion;
        this.vitalidad = vitalidad;
        this.alcance = alcance;
        this.danio = danio;
    }

    public abstract boolean atacar(Personaje otro);
    public abstract void recibirDano(int cantidad);

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public double getX(){
        return this.posicion.getX();
    }

    public double getY(){
        return this.posicion.getY();
    }

    public void incrementaPosicion(double incX, double incY){
        this.posicion.incrementaPosicion(incX, incY);
    }

    public double distancia(Personaje otro){
        return this.posicion.distancia(otro.posicion);
    }
}
