package Ejercicio5;

public class AutomovilManual extends Automovil {
    public AutomovilManual(String patente, double velocidadmaxima) {
        super(patente, velocidadmaxima);
    }

    public AutomovilManual(String patente) {
        super(patente);
    }

    @Override
    public void acelerar(double vel) {
        if (vel > 0 && this.velocidad >= 0 && this.marcha > 0)
            if (this.velocidad + vel > this.velocidadmaxima) {
                this.velocidad = this.velocidadmaxima;
            } else
                this.velocidad += vel;
        else if (vel < 0 && this.marcha == -1 && this.velocidad <= 0) {
            this.velocidad += vel;
        }
    }

    @Override
    public void frenar(double vel) {
        if (vel > 0)
            if (this.velocidad > 0)
                if (this.velocidad <= vel)
                    this.velocidad = 0;
                else
                    this.velocidad -= vel;
            else if (this.velocidad + vel >= 0)
                this.velocidad = 0;
            else
                this.velocidad += vel;
    }

    @Override
    public void setMarcha(int nuevamarcha) {
        super.setMarcha(nuevamarcha);
    }
}
