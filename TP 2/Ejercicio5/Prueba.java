package Ejercicio5;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("25 de mayo");
        ArrayList<Categoria> categorias;
        ArrayList<Chofer> choferes;

        // Categorias
        categorias = empresa.getCategorias();
        empresa.agregarCategoria(new Categoria("Principiante"));
        categorias.get(0).setSueldo(500000);
        empresa.agregarCategoria(new Categoria("Amateur"));
        categorias.get(1).setSueldo(800000);
        empresa.agregarCategoria(new Categoria("Profesional"));
        categorias.get(2).setSueldo(1500000);

        // Colectivos
        empresa.agregarColectivo(new Colectivo("2016"));
        empresa.agregarColectivo(new Colectivo("2020"));

        // Choferes
        choferes = empresa.getPersonal();
        empresa.agregarChofer(new Chofer("Andres"));
        choferes.get(0).setCategoria(categorias.get(2));
        choferes.get(0).setDomicilio(new Domicilio("Av Callao", 934));
        choferes.get(0).setColectivo(empresa.getColectivos().get(0));
        empresa.agregarChofer(new Chofer("Carlos"));
        choferes.get(1).setCategoria(categorias.get(1));
        choferes.get(1).setDomicilio(new Domicilio("Avellaneda", 123));
        choferes.get(1).setColectivo(empresa.getColectivos().get(1));
        empresa.agregarChofer(new Chofer("Pedro"));
        choferes.get(2).setCategoria(categorias.get(0));
        choferes.get(2).setDomicilio(new Domicilio("Av De Las Camelias", 1345));

        for (Chofer chofer : choferes) {
            System.out.println(chofer);
        }
    }
}
