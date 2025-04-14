public class Clase3 extends Clase2 {
    public int atributo = 3;

    public int metodo1() {
        return super.metodo1();
    }

    public void metodo2() {
        super.metodo2();
        System.out.println("Clase3.metodo2");
    }

    public void metodo3() {
        super.metodo3();
        System.out.println("Clase2.metodo3");
    }

    public int getAtributo() {
        return atributo;
    }

}
