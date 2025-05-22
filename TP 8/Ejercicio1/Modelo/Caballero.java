package Ejercicio1.Modelo;

public class Caballero extends Personaje {
    private static int vitalidadInicial = 500;

    public Caballero(String nombre) {
        super(nombre, 10);
        this.vitalidad = vitalidadInicial;
        this.alcance = 10;
        this.danio = 10;
    }

    @Override
    public void respawn() {
        this.vitalidad = vitalidadInicial;
        super.respawn();
    }
}
