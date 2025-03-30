package Ejercicio5;

public class AutomovilAutomatico extends Automovil {
    public AutomovilAutomatico(String patente, double velmax) {
        super(patente, velmax);
    }

    public AutomovilAutomatico(String patente) {
        super(patente);
    }

    private void determinarMarcha() {
        if (this.velocidad <= 35)
            if (this.velocidad <= 10)
                if (this.velocidad < 0)
                    this.marcha = -1;
                else if (this.velocidad == 0)
                    this.marcha = 0;
                else
                    this.marcha = 1;
            else
                this.marcha = 2;
        else if (this.velocidad <= 50)
            this.marcha = 3;
        else if (this.velocidad <= 90)
            this.marcha = 4;
        else
            this.marcha = 5;
    }

    @Override
    public void acelerar(double vel) {
        if (vel > 0 && this.velocidad >= 0)
            if (this.velocidad + vel > this.velocidadmaxima)
                this.velocidad = this.velocidadmaxima;
            else
                this.velocidad += vel;
        else if (vel < 0 && this.velocidad <= 0)
            this.velocidad += vel;
        this.determinarMarcha();
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
        this.determinarMarcha();
    }

}
