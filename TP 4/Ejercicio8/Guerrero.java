package Ejercicio8;

public class Guerrero extends Personaje {
    private int armadura;
    private static int vitalidadInicial = 800;

    public Guerrero(String nombre) {
        super(nombre);
        this.vitalidad = vitalidadInicial;
        this.alcance = 5;
        this.danio = 10;
    }

    public Guerrero(String nombre, int armadura) {
        this(nombre);
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    @Override
    public void recibeDanio(int cantidad) {
        if (armadura == 0) {
            super.recibeDanio(cantidad);
        } else {
            if (cantidad < armadura) {
                this.armadura -= cantidad;
            } else {
                cantidad -= this.armadura;
                this.armadura = 0;
                super.recibeDanio(cantidad);
            }
        }

    }

    @Override
    public void respawn() {
        this.vitalidad = vitalidadInicial;
        super.respawn();
    }
}
