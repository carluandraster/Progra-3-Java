public class Cuartel extends Edificio {
    public Cuartel(String equipo, int x, int y) {
        super(equipo, 500, 3000, x, y, 60);
    }

    @Override
    public void recibeDano(int cantidad) {
        if (cantidad * 2 >= this.energia) {
            this.energia = 0;
        } else {
            this.energia -= cantidad / 2;
        }
    }
}
