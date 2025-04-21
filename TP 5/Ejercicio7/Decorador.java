public abstract class Decorador implements IPersonaje {
    protected Personaje base;

    public Decorador(Personaje base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Armadura: " + this.getArmadura() + "\n" +
                "Ataque corto: " + this.getAtaqueCorto() + "\n" +
                "Ataque distante: " + this.getAtaqueDistante() + "\n";
    }
}
