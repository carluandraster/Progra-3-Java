public class Fuego extends Decorador {
    public Fuego(Personaje base) {
        super(base);
    }

    @Override
    public double getArmadura() {
        return this.base.getArmadura() * 0.5;
    }

    @Override
    public double getAtaqueCorto() {
        return this.base.getAtaqueCorto() * 1.8;
    }

    @Override
    public double getAtaqueDistante() {
        return this.base.getAtaqueDistante() * 1.7;
    }

    public void incenciar() {
        System.out.println("Incendiando...");
    }
}
