package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        Base e = new Extendida();
        /* 1 */System.out.println(b.metodo1(e));
        /* 2 */System.out.println(e.metodo1(e));
        /* 3 */System.out.println(b.metodo1((Extendida) e));
        /* 4 */System.out.println(e.metodo1((Extendida) e));
        /* 5 */// System.out.println(b.metodo2(b));
        /* 6 */// System.out.println(e.metodo2(e));
        /* 7 */// System.out.println(e.metodo2((Extendida) b));
        /* 8 */System.out.println(e.metodo2((Extendida) e));
        Extendida x = (Extendida) e;
        /* 9 */System.out.println(x.metodo2(b));
        /* 10 */System.out.println(x.metodo2(e));
    }
}
