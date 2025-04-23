import java.util.HashMap;

public class Mapa implements Cloneable{
    HashMap<String, Personaje> personajes;

    public Mapa(){
        this.personajes = new HashMap<>();
    }

    public HashMap<String, Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(HashMap<String, Personaje> personajes) {
        this.personajes = personajes;
    }

    public void agregarPersonaje(Personaje personaje){
        this.personajes.put(personaje.getNombre(), personaje);
    }

    public void eliminaPersonaje(String personaje){
        this.personajes.remove(personaje);
    }

    public void mueve (Personaje personaje, double valorX, double valorY){
        double xf, yf, m, hip;
        try {
            personaje.incrementaPos(valorX, valorY);
        } catch (IncrementoImposibleException e) {
            m = valorY / valorX;
            hip = e.getMaxDistanciaSoportada();
            xf = hip / Math.sqrt(1+Math.pow(m,2));
            if (valorX < 0) {
                xf = -xf;
            }
            yf = m*xf;
            this.mueve(personaje,xf, yf);
        }
    }

    public void ataca(Personaje atacante, Personaje atacado) throws AtaqueImposibleException{
        try {
            atacante.ataca(atacado);
        } catch (AtaqueImposibleException e) {
            System.err.println(e.toString());
            throw new InternalError(e.toString());
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Mapa aux;
        Personaje p;
        try {
            aux = (Mapa)super.clone();
            aux.personajes = new HashMap<>();
            for (Personaje personaje : this.personajes.values()) {
                p = (Personaje) personaje.clone();
                aux.personajes.put(p.getNombre(), p);
            }
            return aux;
        } catch (CloneNotSupportedException e) {
            System.err.println("Este mapa no se puede clonar porque hay personajes que no son clonables");
            throw new InternalError(e.toString());
        }
    }
}
