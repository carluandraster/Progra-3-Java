import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Mazo {
    private static Mazo _instancia = null;
    private ArrayList<IPersonaje> personajes;

    private Mazo() {
        this.personajes = new ArrayList<>();
    }

    public static Mazo getInstancia() {
        if (_instancia == null) {
            _instancia = new Mazo();
        }
        return _instancia;
    }

    public IPersonaje eligeAdversario() {
        Random rand = new Random();
        return personajes.get(rand.nextInt(personajes.size()));
    }

    public void agregarPersonaje(String tipo) {
        this.personajes.add(PersonajeFactory.getInstancia().crearPersonaje(tipo));
    }

    public void agregarPersonaje(String tipo, String decorador) {
        this.personajes.add(PersonajeFactory.getInstancia().crearPersonaje(tipo, decorador));
    }

    public void eliminarPersonaje(int indice) {
        this.personajes.remove(indice);
    }

    public ArrayList<IPersonaje> getPersonajes() {
        return personajes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<IPersonaje> it = this.personajes.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
