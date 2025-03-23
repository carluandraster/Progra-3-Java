package Ejercicio5;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Colectivo> colectivos = new ArrayList<>();
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Chofer> personal = new ArrayList<>();
    private static int siguienteNumero = 0;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarColectivo(Colectivo colectivo) {
        colectivo.setNumerointerno(siguienteNumero);
        this.colectivos.add(colectivo);
        siguienteNumero++;
    }

    public void eliminarColectivo(Colectivo colectivo) {
        this.colectivos.remove(colectivo);
    }

    public ArrayList<Colectivo> getColectivos() {
        return colectivos;
    }

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void agregarChofer(Chofer chofer) {
        this.personal.add(chofer);
    }

    public void despedirChofer(Chofer chofer) {
        this.personal.remove(chofer);
    }

    public ArrayList<Chofer> getPersonal() {
        return personal;
    }

    public int getChoferesSinColectivo() {
        int contador = 0;
        for (Chofer chofer : this.personal)
            if (chofer.getColectivo() == null) {
                contador++;
            }
        return contador;
    }

    public int getCantidadColectivos() {
        return this.colectivos.size();
    }

    // Devuelve los choferes de una categoria
    public ArrayList<Chofer> getChoferesCategoria(Categoria categoria) {
        ArrayList<Chofer> aux = new ArrayList<>();
        for (Chofer chofer : this.personal)
            if (chofer.getCategoria() == categoria)
                aux.add(chofer);
        return aux;
    }

    // Devuelve las categorias que cobran al menos un determinado monto
    public ArrayList<Categoria> getCategoriasSueldo(double minSueldo) {
        ArrayList<Categoria> aux = new ArrayList<>();
        for (Categoria categoria : this.categorias)
            if (categoria.getSueldo() >= minSueldo)
                aux.add(categoria);
        return aux;
    }

    // Devuelve los choferes que cobran al menos un determinado monto
    public ArrayList<Chofer> getChoferesSueldo(double minSueldo) {
        ArrayList<Chofer> aux = new ArrayList<>();
        for (Chofer chofer : this.personal)
            if (chofer.getCategoria().getSueldo() >= minSueldo)
                aux.add(chofer);
        return aux;
    }
}
