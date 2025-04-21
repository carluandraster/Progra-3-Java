public class Tierra extends Decorador {

    public Tierra(Personaje base) {
        super(base);
    }

    @Override
    public double getArmadura() {
        return this.base.getArmadura() * 1.25;
    }

    @Override
    public double getAtaqueCorto() {
        return this.base.getAtaqueCorto() * 0.8;
    }

    @Override
    public double getAtaqueDistante() {
        return this.base.getAtaqueDistante() * 0.7;
    }
}
