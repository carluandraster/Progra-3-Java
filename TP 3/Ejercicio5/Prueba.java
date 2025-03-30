package Ejercicio5;

public class Prueba {
    public static void main(String[] args) {
        AutomovilManual am = new AutomovilManual("AB 123 CD");
        AutomovilAutomatico aa = new AutomovilAutomatico("FG 456 HI", 90);

        am.setMarcha(1);
        am.acelerar(45);
        am.frenar(10);
        am.setMarcha(5);
        am.acelerar(100);
        System.out.println(am);
        am.frenar(135);

        aa.acelerar(60);
        aa.acelerar(40);
        System.out.println(aa);
        aa.frenar(100);
    }
}
