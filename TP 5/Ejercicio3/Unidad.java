public abstract class Unidad implements IPosicionable {
    private String equipo;
    private int costo;
    protected int energia;
    protected Posicion posicion;

    public Unidad(String equipo, int costo, int energia, int x, int y) {
        this.equipo = equipo;
        this.costo = costo;
        this.energia = energia;
        this.posicion = new Posicion(x, y);
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void recibeDano(int cantidad);

    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public int getX() {
        return this.posicion.getX();
    }

    @Override
    public int getY() {
        return this.posicion.getY();
    }
}
