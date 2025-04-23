package Ejercicio3;

public class Surtidor {
    private double cantidadDiesel;
    private double cantidadPremium;
    private double cantidadSuper;
    private static double capacidadMaxima = 20000;

    public Surtidor() {
        this.cantidadDiesel = capacidadMaxima;
        this.cantidadPremium = capacidadMaxima;
        this.cantidadSuper = capacidadMaxima;
    }

    public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaException {
        double cantidadDisponible;
        if (combustible.equalsIgnoreCase("DIESEL")) {
            cantidadDisponible = this.cantidadDiesel;
        } else {
            if (combustible.equalsIgnoreCase("PREMIUM")) {
                cantidadDisponible = this.cantidadPremium;
            } else {
                if (combustible.equalsIgnoreCase("SUPER")) {
                    cantidadDisponible = this.cantidadSuper;
                } else {
                    throw new TipoCombustibleInvalidoException("El tipo de combustible " + combustible + " no existe",
                            combustible, cantidad, 0);
                }
            }
        }
        if (cantidad < 0) {
            throw new CargaInvalidaException("No se puede cargar cantidades negativas", combustible, cantidad,
                    cantidadDisponible);
        } else {
            try {
                if (cantidad > cantidadDisponible) {
                    throw new FaltaCombustibleException(
                            "Se solicito " + cantidad + " L de " + combustible + " pero tan solo hay "
                                    + cantidadDisponible + " L",
                            combustible, cantidad, cantidadDisponible);
                } else {
                    if (combustible.equalsIgnoreCase("DIESEL")) {
                        this.cantidadDiesel -= cantidad;
                    } else {
                        if (combustible.equalsIgnoreCase("PREMIUM")) {
                            this.cantidadPremium -= cantidad;
                        } else {
                            this.cantidadSuper -= cantidad;
                        }
                    }
                }
            } catch (FaltaCombustibleException e) {
                System.err.println(e);
                if (combustible.equalsIgnoreCase("DIESEL")) {
                    this.cantidadDiesel = 0;
                } else {
                    if (combustible.equalsIgnoreCase("PREMIUM")) {
                        this.cantidadPremium = 0;
                    } else {
                        this.cantidadSuper = 0;
                    }
                }

            }
        }
    }

    public double getCantidadDiesel() {
        return cantidadDiesel;
    }

    public double getCantidadPremium() {
        return cantidadPremium;
    }

    public double getCantidadSuper() {
        return cantidadSuper;
    }

    public void llenarDiesel() {
        this.cantidadDiesel = capacidadMaxima;
    }

    public void llenarSuper() {
        this.cantidadSuper = capacidadMaxima;
    }

    public void llenarPremium() {
        this.cantidadPremium = capacidadMaxima;
    }
}
