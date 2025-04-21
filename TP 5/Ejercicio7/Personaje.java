public abstract class Personaje implements IPersonaje {
    private double armadura;
    private double ataqueCorto;
    private double ataqueDistante;

    public Personaje(double armadura, double ataqueCorto, double ataqueDistante) {
        this.armadura = armadura;
        this.ataqueCorto = ataqueCorto;
        this.ataqueDistante = ataqueDistante;
    }

    @Override
    public double getArmadura() {
        return armadura;
    }

    @Override
    public double getAtaqueCorto() {
        return ataqueCorto;
    }

    @Override
    public double getAtaqueDistante() {
        return ataqueDistante;
    }

    @Override
    public String toString() {
        return "Armadura: " + this.armadura + "\n" +
                "Ataque corto: " + this.ataqueCorto + "\n" +
                "Ataque distante: " + this.ataqueDistante + "\n";
    }
}
