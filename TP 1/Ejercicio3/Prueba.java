package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Categoria cat1, cat2, cat3;
        Empleado e1, e2, e3, e4, e5, e6;

        cat1 = new Categoria("Principiante", 80);
        cat2 = new Categoria("Operario", 100);
        cat3 = new Categoria("Experto", 130);

        e1 = new Empleado();
        e1.setNombre("Juan Perez");
        e1.setCat(cat1);
        e1.setHstrabajadas(100);
        e1.setAntiguedad(4);
        System.out.println("Sueldo de " + e1.getNombre() + ": $" + e1.getSueldo());

        e2 = new Empleado();
        e2.setNombre("Roberto Gonzalez");
        e2.setCat(cat1);
        e2.setHstrabajadas(120);
        e2.setAntiguedad(8);
        System.out.println("Sueldo de " + e2.getNombre() + ": $" + e2.getSueldo());

        e3 = new Empleado();
        e3.setNombre("Sandra Lopez");
        e3.setCat(cat1);
        e3.setHstrabajadas(120);
        e3.setAntiguedad(14);
        System.out.println("Sueldo de " + e3.getNombre() + ": $" + e3.getSueldo());

        e4 = new Empleado();
        e4.setNombre("German Gutierrez");
        e4.setCat(cat2);
        e4.setHstrabajadas(110);
        e4.setAntiguedad(16);
        System.out.println("Sueldo de " + e4.getNombre() + ": $" + e4.getSueldo());

        e5 = new Empleado();
        e5.setNombre("Vicente Hernandez");
        e5.setCat(cat3);
        e5.setHstrabajadas(100);
        e5.setAntiguedad(9);
        System.out.println("Sueldo de " + e5.getNombre() + ": $" + e5.getSueldo());

        e6 = new Empleado();
        e6.setNombre("Carolina Gomez");
        e6.setCat(cat3);
        e6.setHstrabajadas(115);
        e6.setAntiguedad(20);
        System.out.println("Sueldo de " + e6.getNombre() + ": $" + e6.getSueldo());
    }
}
