public abstract class Animal implements Emisor_De_Sonido {
    String nombre;
    int esperanzaDeVida;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, int esperanzaDeVida) {
        this.nombre = nombre;
        this.esperanzaDeVida = esperanzaDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEsperanzaDeVida() {
        return esperanzaDeVida;
    }

    public void setEsperanzaDeVida(int esperanzaDeVida) {
        this.esperanzaDeVida = esperanzaDeVida;
    }

    @Override
    public abstract void emiteSonido();

    @Override
    public String toString() {
        return this.nombre + " dice ";
    }
}
