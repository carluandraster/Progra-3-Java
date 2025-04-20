public class Metal extends Material {
    private String nombre;

    public Metal(String nombre, String color) {
        super(color);
        this.nombre = nombre;
    }

    @Override
    public String trabajado(String tipo) {
        String aux;
        if (tipo.equalsIgnoreCase("JUGUETE")) {
            aux = "un autito de " + this;
        } else {
            if (tipo.equalsIgnoreCase("JOYA")) {
                aux = "un anillo de " + this;
            } else {
                aux = "otra cosa de " + this;
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.color;
    }
}
