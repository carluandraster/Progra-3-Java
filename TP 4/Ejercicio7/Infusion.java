package Ejercicio7;

public abstract class Infusion {
    public void prepararInfusion() {
        this.calentarAgua();
        this.agregarTipoInfusion();
        this.endulzar();
    }

    protected void calentarAgua() {
        System.out.println("Calentando el agua");
    }

    protected void agregarTipoInfusion() {
        System.out.println("Se agrega infusion al recipiente");
    }

    // Por defecto, la infusion será amarga
    protected void endulzar() {
        System.out.println("La bebida se tomara amarga");
    }

    public void tomar() {
        System.out.println("Tomando bebida");
    }
}
