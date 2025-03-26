public class Guerrero extends Personaje {
    public Guerrero(String nombre, Posicion posicion){
        super(nombre,posicion,500,10,10);
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
        this.vitalidad -= cantidad;
    }
    
}
