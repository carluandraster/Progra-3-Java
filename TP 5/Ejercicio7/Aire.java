public class Aire extends Decorador {
    public Aire(Personaje base) {
        super(base);
    }

    @Override
    public double getArmadura() {
        return this.base.getArmadura() * 0.9;
    }

    @Override
    public double getAtaqueCorto() {
        return this.base.getAtaqueCorto() * 1.2;
    }

    @Override
    public double getAtaqueDistante() {
        return this.base.getAtaqueDistante() * 1.1;
    }

    public void invocarHuracan() {
        System.out.println("Invocando huracan...");
    }
}
