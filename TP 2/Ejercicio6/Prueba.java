package Ejercicio6;

public class Prueba {
    public static void main(String[] args) {
        Estacion estacion = new Estacion();
        int i;
        Surtidor nuevoSurtidor;
        for (i = 0; i < 5; i++) {
            nuevoSurtidor = new Surtidor();
            estacion.agregarSurtidor(nuevoSurtidor);
            nuevoSurtidor.llenarDepositoGasoil();
            nuevoSurtidor.llenarDepositoPremium();
            nuevoSurtidor.llenarDepositoSuper();
        }
        estacion.getSurtidores().get(0).extraerGasoil(200);
        estacion.getSurtidores().get(1).extraerGasoil(900);
        estacion.getSurtidores().get(2).extraerGasoil(3000);
        estacion.getSurtidores().get(0).extraerGasoil(100);
        System.out.println("Cantidad total de surtidores: " + estacion.getCantSurtidores() + "\n" +
                "Volumen de gasoil disponible: " + estacion.getCantLitros(0) + "\n" +
                "Surtidor que ha realizado mayor cantidad de ventas de gasoil: " + estacion.maxVentas(0) + "\n" +
                "Histórico de los litros vendidos de gasoil: " + estacion.historico(0));
    }
}
