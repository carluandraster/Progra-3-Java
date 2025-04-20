package Ejercicio9;

public class Extendida extends Base {
    @Override
    String metodo1(Extendida x) {
        return "metodo 1 en clase Extendida, parametro Extendida: " + x.toString();
    }

    String metodo2(Base y) {
        return "metodo 2 en clase Extendida, parametro Base: " + y.toString();
    }

    @Override
    public String toString() {
        return "soy Extendido";
    }

}
