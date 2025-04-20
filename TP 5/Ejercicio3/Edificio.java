public abstract class Edificio extends Unidad implements IConstruible {
    private int tiempoDeConstruccion;

    public Edificio(String equipo, int costo, int energia, int x, int y, int tiempoDeConstruccion) {
        super(equipo, costo, energia, x, y);
        this.tiempoDeConstruccion = tiempoDeConstruccion;
    }

    public void setTiempoDeConstruccion(int tiempoDeConstruccion) {
        this.tiempoDeConstruccion = tiempoDeConstruccion;
    }

    @Override
    public int getTiempoConstruccion() {
        return tiempoDeConstruccion;
    }
}
