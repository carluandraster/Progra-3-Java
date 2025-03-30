package Ejercicio5;

public abstract class Automovil {
    private String patente;
    protected double velocidad;
    protected double velocidadmaxima;
    protected int marcha;

    public Automovil(String patente, double velocidadmaxima) {
        this.patente = patente;
        this.velocidad = 0;
        this.velocidadmaxima = velocidadmaxima;
        this.marcha = 0;
    }

    public Automovil(String patente) {
        this(patente, 160);
    }

    public String getPatente() {
        return patente;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public abstract void acelerar(double vel);

    public abstract void frenar(double vel);

    @Override
    public String toString() {
        return "Patente: " + this.patente + "\n" +
                "Velocidad: " + this.velocidad + "km/h\n" +
                "Marcha: " + this.marcha;
    }

    protected void setMarcha(int nuevamarcha) {
        if (nuevamarcha >= -1 && nuevamarcha <= 5)
            this.marcha = nuevamarcha;
    }
}
