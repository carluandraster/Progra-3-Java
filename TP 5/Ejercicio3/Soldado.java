public class Soldado extends Personaje implements IHostil {
    public Soldado(String equipo) {
        super(equipo, 100, 500);
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
        adversario.recibeDano(50);
    }
}
