public class Medico extends Personaje {
    public Medico(String equipo) {
        super(equipo, 40, 100);
    }

    @Override
    public void recibeDano(int cantidad) {
        cantidad *= 1.5;
        if (cantidad >= this.energia) {
            this.energia = 0;
        } else {
            this.energia -= cantidad;
        }
    }
}
