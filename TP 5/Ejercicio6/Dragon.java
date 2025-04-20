public class Dragon extends Personaje {
    private int poderDeFuego;
    private static int vitalidadInicial = 1000;

    public Dragon(String nombre) {
        super(nombre);
        this.poderDeFuego = this.danio = 100;
        this.alcance = 50;
    }

    @Override
    public void recibeDanio(int cantidad) {
        cantidad *= 0.5;
        super.recibeDanio(cantidad);
    }

    @Override
    public void respawn() {
        this.vitalidad = vitalidadInicial;
        this.poderDeFuego = this.danio = 100;
        super.respawn();
    }

    @Override
    public void hechizarse(String tipo) {
        if (tipo.equalsIgnoreCase("BENDICION")) {
            this.poderDeFuego *= 1.4;
            this.danio *= 1.4;
            this.vitalidad += 250;
        } else {
            this.poderDeFuego *= 0.7;
            this.danio *= 0.7;
            this.vitalidad *= 0.8;
        }
    }

    public int getPoderDeFuego() {
        return poderDeFuego;
    }

}
