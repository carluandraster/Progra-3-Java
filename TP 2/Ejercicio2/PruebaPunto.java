public class PruebaPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = null;
        Punto p3 = new Punto(0, 0);
        System.out.println("P1=" + p1.cartel());
        p3 = p2;
        p2 = p1;
        p1.cambia(8, 5);
        System.out.println("P2=" + p2.cartel());
    }
}