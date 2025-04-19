package Ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;

import Ejercicio5.Vehiculos.*;
import Ejercicio5.Choferes.*;
import Ejercicio5.Factories.*;

public class Empresa {
    private static Empresa _instancia = null;
    private HashMap<Integer, Vehiculo> vehiculos;
    private HashMap<Integer, Acoplado> acoplados;
    private HashMap<String, Categoria> categorias;
    private HashMap<String, Chofer> personal;
    private static int siguienteNumero = 0;
    private static int siguienteNumeroAcoplado = 0;
    private VehiculoFactory creadorDeVehiculos;
    private CategoriaFactory creadorDeCategorias;
    private ChoferFactory creadorDeChoferes;
    private AcopladoFactory generadorDeAcoplados;

    public Empresa() {
        this.vehiculos = new HashMap<>();
        this.categorias = new HashMap<>();
        this.personal = new HashMap<>();
        this.acoplados = new HashMap<>();

        this.creadorDeVehiculos = VehiculoFactory.getInstancia();
        this.creadorDeCategorias = CategoriaFactory.getInstancia();
        this.creadorDeChoferes = ChoferFactory.getInstancia();
        this.generadorDeAcoplados = AcopladoFactory.getInstancia();
    }

    public static Empresa getInstancia() {
        if (_instancia == null)
            _instancia = new Empresa();
        return _instancia;
    }

    public void agregarVehiculo(String modelo) {
        if (modelo != null && modelo != "") {
            ColectivoDeLinea vehiculo = this.creadorDeVehiculos.crearVehiculo(modelo, siguienteNumero);
            this.vehiculos.put(siguienteNumero, vehiculo);
            siguienteNumero++;
        }
    }

    public void agregarVehiculo(String modelo, boolean cochecama) {
        ColectivoDeLargaDistancia vehiculo;
        if (modelo != null && modelo != "") {
            vehiculo = this.creadorDeVehiculos.crearVehiculo(modelo, cochecama, siguienteNumero);
            this.vehiculos.put(siguienteNumero, vehiculo);
            siguienteNumero++;
        }
    }

    public void agregarVehiculo(String modelo, int tara, int cargaMaxima) {
        Camion vehiculo;
        if (modelo != null && modelo != "" && tara >= 0 && cargaMaxima >= 0) {
            vehiculo = this.creadorDeVehiculos.crearVehiculo(modelo, tara, cargaMaxima, siguienteNumero);
            this.vehiculos.put(siguienteNumero, vehiculo);
            siguienteNumero++;
        }
    }

    public void agregarVehiculo(String modelo, int tara, int cargaMaxima, int numeroAcoplado) {
        Camion vehiculo;
        if (modelo != null && modelo != "" && tara >= 0 && cargaMaxima >= 0) {
            vehiculo = this.creadorDeVehiculos.crearVehiculo(modelo, tara, cargaMaxima, siguienteNumero);
            vehiculo.setAcoplado(this.acoplados.get(numeroAcoplado));
            this.vehiculos.put(siguienteNumero, vehiculo);
            siguienteNumero++;
        }
    }

    public void eliminarVehiculo(int numeroInterno) {
        this.vehiculos.remove(numeroInterno);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return (ArrayList<Vehiculo>) this.vehiculos.values();
    }

    public void agregarCategoria(String nombrecategoria, double sueldo, boolean habilitaColectivoLinea,
            boolean habilitaColectivoLarga, boolean habilitaCamion) {
        if (nombrecategoria != null && nombrecategoria != "" && sueldo > 0)
            this.categorias.put(nombrecategoria, this.creadorDeCategorias.crearCategoria(nombrecategoria, sueldo,
                    habilitaColectivoLinea, habilitaColectivoLarga, habilitaCamion));
    }

    public void eliminarCategoria(String categoria) {
        this.categorias.remove(categoria);
    }

    public ArrayList<Categoria> getCategorias() {
        return (ArrayList<Categoria>) this.categorias.values();
    }

    public void agregarChofer(String nombre, String calle, int altura) {
        if (nombre != null && nombre != "" && calle != null && calle != "" && altura >= 0)
            this.personal.put(nombre, this.creadorDeChoferes.crearChofer(nombre, calle, altura));
    }

    public void agregarChofer(String nombre, Categoria categoria, String calle, int altura) {
        if (nombre != null && nombre != "" && categoria != null && calle != null && calle != "" && altura >= 0)
            this.personal.put(nombre, this.creadorDeChoferes.crearChofer(nombre, categoria, calle, altura));
    }

    public void despedirChofer(String chofer) {
        this.personal.remove(chofer);
    }

    public ArrayList<Chofer> getPersonal() {
        return (ArrayList<Chofer>) this.personal.values();
    }

    public void agregarAcoplado(int tara, int cargaMaxima, boolean refrigerado) {
        if (tara > 0 && cargaMaxima > 0) {
            this.acoplados.put(siguienteNumeroAcoplado,
                    this.generadorDeAcoplados.generarAcoplado(tara, cargaMaxima, refrigerado));
            siguienteNumeroAcoplado++;
        }
    }

    public int getChoferesSinVehiculo() {
        int contador = 0;
        for (Chofer chofer : this.personal.values())
            if (chofer.getVehiculo() == null) {
                contador++;
            }
        return contador;
    }

    public int getCantidadVehiculos() {
        return this.vehiculos.size();
    }

    // Devuelve los choferes de una categoria
    public ArrayList<Chofer> getChoferesCategoria(Categoria categoria) {
        ArrayList<Chofer> aux = new ArrayList<>();
        for (Chofer chofer : this.personal.values())
            if (chofer.getCategoria() == categoria)
                aux.add(chofer);
        return aux;
    }

    // Devuelve las categorias que cobran al menos un determinado monto
    public ArrayList<Categoria> getCategoriasSueldo(double minSueldo) {
        ArrayList<Categoria> aux = new ArrayList<>();
        for (Categoria categoria : this.categorias.values())
            if (categoria.getSueldo() >= minSueldo)
                aux.add(categoria);
        return aux;
    }

    // Devuelve los choferes que cobran al menos un determinado monto
    public ArrayList<Chofer> getChoferesSueldo(double minSueldo) {
        ArrayList<Chofer> aux = new ArrayList<>();
        for (Chofer chofer : this.personal.values())
            if (chofer.getCategoria().getSueldo() >= minSueldo)
                aux.add(chofer);
        return aux;
    }
}
