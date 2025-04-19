package Ejercicio7;

public class Cafe extends Infusion {
    private boolean esDulce;

    public Cafe(boolean esDulce) {
        this.esDulce = esDulce;
    }

    @Override
    protected void agregarTipoInfusion() {
        System.out.println("Se agrega Cafe Molido a la taza");
    }

    @Override
    protected void endulzar() {
        if (esDulce) {
            System.out.println("Se agrega azucar a la bebida\r");
        } else {
            super.endulzar();
        }
    }
}
