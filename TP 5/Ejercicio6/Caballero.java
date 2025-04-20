
public class Caballero extends Personaje {
    private static int vitalidadInicial = 500;

    public Caballero(String nombre) {
        super(nombre);
        this.vitalidad = vitalidadInicial;
        this.alcance = 10;
        this.danio = 10;
    }

    @Override
    public void respawn() {
        this.vitalidad = vitalidadInicial;
        super.respawn();
    }

    @Override
    public void hechizarse(String tipo) {
        if (tipo.equalsIgnoreCase("BENDICION")) {
            this.vitalidad *= 1.25;
        } else {
            this.vitalidad *= 0.5;
        }
    }
}
