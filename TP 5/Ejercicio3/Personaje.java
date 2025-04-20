public abstract class Personaje extends Unidad implements IMovible {
    public Personaje(String equipo, int costo, int energia) {
        super(equipo, costo, energia, 0, 0);
    }

    @Override
    public void mover(int x, int y) {
        this.posicion.incrementaPos(x, y);
    }
}
