package Ejercicio7;

public class Prueba {
    public static void main(String[] args) {
        Mate mate = new Mate();
        Cafe cafeDulce = new Cafe(true);
        Cafe cafeAmargo = new Cafe(false);

        System.out.println("MATE");
        mate.prepararInfusion();
        mate.tomar();
        System.out.println("CAFE DULCE");
        cafeDulce.prepararInfusion();
        cafeDulce.tomar();
        System.out.println("CAFE AMARGO");
        cafeAmargo.prepararInfusion();
        cafeAmargo.tomar();
    }
}
