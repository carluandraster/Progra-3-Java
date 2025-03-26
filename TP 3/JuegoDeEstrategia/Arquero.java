public class Arquero extends Personaje{
    protected int cantidadFlechas;
    protected double alcanceFlecha;
    protected int danioFlecha;

    public Arquero(String nombre, Posicion posicion){
        super(nombre, posicion, 300, 20, 5);
        this.cantidadFlechas = 20;
        this.alcanceFlecha = 100;
        this.danioFlecha = 5;
    }

    @Override
    public boolean atacar(Personaje otro) {
        if (this.cantidadFlechas > 0 && this.alcanceFlecha >= this.distancia(otro)) {
            otro.recibirDano(danioFlecha);
            return true;
        }
        else if(this.distancia(otro) <= this.alcance){
            otro.recibirDano(danio);
            return true;
        }
        else{
             return false;
        }
    }

    @Override
    public void recibirDano(int cantidad) {
        this.vitalidad -= cantidad;
    }

    // Importante declarar al objeto como tipo Arquero para que pueda acceder a este metodo
    // Una variable de tipo Personaje, por mas que sea un objeto Arquero, no podra acceder a los metodos propios de los hijos de Personaje.
    public void agregarFlechas(int cantidad){
        this.cantidadFlechas += cantidad;
    }
}
