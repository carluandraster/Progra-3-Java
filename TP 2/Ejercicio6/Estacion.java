package Ejercicio6;

import java.util.ArrayList;

public class Estacion {
    private ArrayList<Surtidor> surtidores = new ArrayList<>();

    public void agregarSurtidor(Surtidor surtidor) {
        surtidores.add(surtidor);
    }

    public int getCantSurtidores() {
        return this.surtidores.size();
    }

    public int getCantLitros(int tipoCombustible) {
        int aux = 0;
        switch (tipoCombustible) {
            case 0: // Gasoil
                for (Surtidor surtidor : this.surtidores)
                    aux += surtidor.getCantGasoil();
                break;

            case 1: // Premium
                for (Surtidor surtidor : this.surtidores)
                    aux += surtidor.getCantPremium();
                break;

            case 2: // Super
                for (Surtidor surtidor : this.surtidores)
                    aux += surtidor.getCantSuper();
                break;

            default:
                return -1;
        }
        return aux;
    }

    public int maxVentas(int tipoCombustible) {
        int maxAux = -1;
        int aux = -1;
        int i = 0;

        switch (tipoCombustible) {
            case 0: // Gasoil
                for (Surtidor surtidor : this.surtidores) {
                    if (surtidor.getCantVentasGasoil() > maxAux) {
                        maxAux = surtidor.getCantVentasGasoil();
                        aux = i;
                    }
                    i++;
                }
                break;

            case 1: // Premium
                for (Surtidor surtidor : this.surtidores) {
                    if (surtidor.getCantVentasPremium() > maxAux) {
                        maxAux = surtidor.getCantVentasPremium();
                        aux = i;
                    }
                    i++;
                }
                break;

            case 2: // Super
                for (Surtidor surtidor : this.surtidores) {
                    if (surtidor.getCantVentasSuper() > maxAux) {
                        maxAux = surtidor.getCantVentasSuper();
                        aux = i;
                    }
                    i++;
                }
                break;
        }
        return aux;
    }

    public int historico(Surtidor surtidor, int tipoCombustible) {
        switch (tipoCombustible) {
            case 0:
                return surtidor.getLitrosGasoilVendidos();
            case 1:
                return surtidor.getLitrosPremiumVendidos();
            case 2:
                return surtidor.getLitrosSuperVendidos();

            default:
                return -1;
        }
    }

    public int historico(int tipoCombustible) {
        int acumulador = 0;
        switch (tipoCombustible) {
            case 0:
                for (Surtidor surtidor : this.surtidores)
                    acumulador += surtidor.getLitrosGasoilVendidos();
                break;
            case 1:
                for (Surtidor surtidor : this.surtidores)
                    acumulador += surtidor.getLitrosPremiumVendidos();
                break;
            case 2:
                for (Surtidor surtidor : this.surtidores)
                    acumulador += surtidor.getLitrosSuperVendidos();
                break;

            default:
                return -1;
        }
        return acumulador;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }
}
