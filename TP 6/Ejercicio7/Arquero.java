
public class Arquero extends Personaje {
    private int cantidadFlechas;
    private static int vitalidadInicial = 500;

    public Arquero(String nombre) {
        super(nombre, 8);
        this.vitalidad = vitalidadInicial;
        this.alcance = 100;
        this.danio = 15;
        this.cantidadFlechas = 20;
    }

    public int getCantidadFlechas() {
        return cantidadFlechas;
    }

    @Override
    public boolean ataca(Personaje personaje) {
        if (this.cantidadFlechas > 0)
            this.cantidadFlechas--;
        boolean aux = super.ataca(personaje);
        if (this.cantidadFlechas == 0) {
            this.alcance = 5;
            this.danio = 5;
        }
        return aux;
    }

    @Override
    public void respawn() {
        this.vitalidad = vitalidadInicial;
        super.respawn();
    }
}
