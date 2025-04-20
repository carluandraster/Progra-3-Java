public class TorretaVigilancia extends Edificio implements IHostil {
    public TorretaVigilancia(String equipo, int x, int y) {
        super(equipo, 200, 2000, x, y, 40);
    }

    @Override
    public void recibeDano(int cantidad) {
        if (cantidad >= this.energia) {
            this.energia = 0;
        } else {
            this.energia -= cantidad;
        }
    }

    @Override
    public void atacar(Unidad adversario) {
        adversario.recibeDano(10);
    }
}
