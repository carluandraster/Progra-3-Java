package Ejercicio5.Factories;

import Ejercicio5.Choferes.Categoria;

public class CategoriaFactory {
    private static CategoriaFactory _instancia = null;

    private CategoriaFactory() {
    }

    public static CategoriaFactory getInstancia() {
        if (_instancia == null)
            _instancia = new CategoriaFactory();
        return _instancia;
    }

    public Categoria crearCategoria(String nombrecategoria, double sueldo, boolean habilitaColectivoLinea,
            boolean habilitaColectivoLarga, boolean habilitaCamion) {
        return new Categoria(nombrecategoria, sueldo, habilitaColectivoLinea, habilitaColectivoLarga, habilitaCamion);
    }
}
