public class Caballero extends Personaje{
    protected int armadura;

    public Caballero(String nombre, Posicion posicion, int armadura){
        super(nombre, posicion, 800, 5, 15);
        this.armadura = 500;
    }

    @Override
    public boolean atacar(Personaje otro) {
        if (this.distancia(otro) <= this.alcance) {
            otro.recibirDano(this.danio);
            return true;
        }
        return false;
    }

    @Override
    public void recibirDano(int cantidad) {
        if (this.armadura > cantidad)
            this.armadura -= cantidad;
        else{
            this.vitalidad -= cantidad - this.armadura;
            this.armadura = 0;
        }
    }

}
