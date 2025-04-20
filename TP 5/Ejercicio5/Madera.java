public class Madera extends Material {
    private String tipo;

    public Madera(String tipo, String color) {
        super(color);
        this.tipo = tipo;
    }

    @Override
    public String trabajado(String tipo) {
        String aux;
        if (tipo.equalsIgnoreCase("JUGUETE")) {
            aux = "un muñequito de " + this;
        } else {
            if (tipo.equalsIgnoreCase("JOYA")) {
                aux = "un par de aros de " + this;
            } else {
                aux = "otra cosa de " + this;
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return this.tipo + " " + this.color;
    }
}
