import java.util.ArrayList;
import java.util.Iterator;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Emisor_De_Sonido> emisoresDeSonido = new ArrayList<>();
        Iterator<Emisor_De_Sonido> it;
        Emisor_De_Sonido aux;
        emisoresDeSonido.add(new Perro("Roxy"));
        emisoresDeSonido.add(new Gato("Michi"));
        emisoresDeSonido.add(new Vaca("Lola"));
        emisoresDeSonido.add(new Pollito("Vignolo"));
        emisoresDeSonido.add(new Ambulancia());
        it = emisoresDeSonido.iterator();
        while (it.hasNext()) {
            aux = it.next();
            aux.emiteSonido();
        }
    }
}
