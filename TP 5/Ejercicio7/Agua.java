public class Agua extends Decorador {
    public Agua(Personaje base) {
        super(base);
    }

    @Override
    public double getArmadura() {
        return this.base.getArmadura() * 0.85;
    }

    @Override
    public double getAtaqueCorto() {
        return this.base.getAtaqueCorto() * 1.2;
    }

    @Override
    public double getAtaqueDistante() {
        return this.base.getAtaqueDistante();
    }
}
