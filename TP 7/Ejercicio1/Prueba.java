import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Prueba {
    public static void main(String[] args) {
        // Declarar las 5 personas
        Persona persona1 = new Persona("Perez", "Carlos", "Colon 3212");
        Persona persona2 = new Persona("Perez", "Carlos", "Colon 3212");
        Persona persona3 = new Persona("Garcia", "Ana", "Mitre 2812");
        Persona persona4 = new Persona("Alvarez", "Valeria", "San Luis 2812");
        Persona persona5 = new Persona("Garcia", "Luis", "Matheu 3538");

        // Inciso c
        System.out.println(persona1 == persona2);
        System.out.println(persona1.equals(persona2));

        Persona[] personas = {persona1, persona2, persona3, persona4, persona5};
        System.out.println("Lista sin ordenar: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Ordenadora.ordenar(personas);
        System.out.println("Lista ordenada: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Inciso d
        HashSet<Persona> conjuntoPersonas = new HashSet<>();
        conjuntoPersonas.add(persona1);
        conjuntoPersonas.add(persona2);
        conjuntoPersonas.add(persona3);
        conjuntoPersonas.add(persona4);
        conjuntoPersonas.add(persona5);
        Iterator<Persona> it = conjuntoPersonas.iterator();
        System.out.println("HashSet: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        LinkedHashSet<Persona> conjuntoEnlazado = new LinkedHashSet<>();
        conjuntoEnlazado.add(persona1);
        conjuntoEnlazado.add(persona2);
        conjuntoEnlazado.add(persona3);
        conjuntoEnlazado.add(persona4);
        conjuntoEnlazado.add(persona5);
        it = conjuntoEnlazado.iterator();
        System.out.println("LinkedHashSet: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<Persona> arbol = new TreeSet<>();
        arbol.add(persona1);
        arbol.add(persona2);
        arbol.add(persona3);
        arbol.add(persona4);
        arbol.add(persona5);
        it = arbol.iterator();
        System.out.println("TreeSet: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Persona> arrPersonas = new ArrayList<>();
        arrPersonas.add(persona1);
        arrPersonas.add(persona2);
        arrPersonas.add(persona3);
        arrPersonas.add(persona4);
        arrPersonas.add(persona5);
        it = arrPersonas.iterator();
        System.out.println("ArrayList: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        LinkedList<Persona> listaEnlazada = new LinkedList<>();
        listaEnlazada.add(persona1);
        listaEnlazada.add(persona2);
        listaEnlazada.add(persona3);
        listaEnlazada.add(persona4);
        listaEnlazada.add(persona5);
        it = listaEnlazada.iterator();
        System.out.println("LinkedList: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        PriorityQueue<Persona> cola = new PriorityQueue<>();
        cola.add(persona1);
        cola.add(persona2);
        cola.add(persona3);
        cola.add(persona4);
        cola.add(persona5);
        System.out.println("PriorityQueue: ");
        Persona aux = cola.poll();
        while (aux != null) {
            System.out.println(aux);
            aux = cola.poll();
        }
    }
}
