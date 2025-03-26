import java.util.ArrayList;

public class Mapa {
    private String nombre;
    private ArrayList<Personaje> personajes = new ArrayList<>();
    

    public Mapa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPersonaje(Personaje personaje){
        this.personajes.add(personaje);
    }

    public void eliminarPersonaje(Personaje personaje){
        this.personajes.remove(personaje);
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    void metodo(Personaje p1, Personaje p2){
        p1.atacar(p2); // p1 atacará a p2 como sea (polimorfismo)
    }

    public void catastrofe(){
        for (int i = 0; i < this.personajes.size(); i++) {
            this.personajes.get(i).recibirDano(200);
        }
    }
}
