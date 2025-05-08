public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Perez", "Carlos", "Colon 3212");
        Persona persona2 = new Persona("Perez", "Carlos", "Colon 3212");
        Persona persona3 = new Persona("Garcia", "Ana", "Mitre 2812");
        Persona persona4 = new Persona("Alvarez", "Valeria", "San Luis 2812");
        Persona persona5 = new Persona("Garcia", "Luis", "Matheu 3538");

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
    }
}
