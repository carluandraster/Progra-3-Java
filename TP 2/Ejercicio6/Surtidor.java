package Ejercicio6;

public class Surtidor {
    private int cantGasoil;
    private int cantPremium;
    private int cantSuper;
    private int cantVentasGasoil;
    private int cantVentasPremium;
    private int cantVentasSuper;
    private int litrosGasoilVendidos;
    private int litrosPremiumVendidos;
    private int litrosSuperVendidos;
    private final int maximaCarga = 20000;

    public Surtidor() {
        this.cantGasoil = this.maximaCarga;
        this.cantPremium = this.maximaCarga;
        this.cantSuper = this.maximaCarga;
        this.cantVentasGasoil = 0;
        this.cantVentasPremium = 0;
        this.cantVentasSuper = 0;
        this.litrosGasoilVendidos = 0;
        this.litrosPremiumVendidos = 0;
        this.litrosSuperVendidos = 0;
    }

    public boolean extraerGasoil(int litros) {
        if (litros < 0)
            return false;
        else {
            this.cantVentasGasoil++;
            if (litros > this.cantGasoil) {
                this.litrosGasoilVendidos += this.cantGasoil;
                this.cantGasoil = 0;
                return false;
            } else {
                this.litrosGasoilVendidos += litros;
                this.cantGasoil -= litros;
                return true;
            }
        }
    }

    public boolean extraerPremium(int litros) {
        if (litros < 0)
            return false;
        else {
            this.cantVentasPremium++;
            if (litros > this.cantPremium) {
                this.litrosPremiumVendidos += this.cantPremium;
                this.cantPremium = 0;
                return false;
            } else {
                this.litrosPremiumVendidos += litros;
                this.cantPremium -= litros;
                return true;
            }
        }
    }

    public boolean extraerSuper(int litros) {
        if (litros < 0)
            return false;
        else {
            this.cantVentasSuper++;
            if (litros > this.cantSuper) {
                this.litrosSuperVendidos += this.cantSuper;
                this.cantSuper = 0;
                return false;
            } else {
                this.litrosSuperVendidos += litros;
                this.cantSuper -= litros;
                return true;
            }
        }
    }

    public int getCantGasoil() {
        return cantGasoil;
    }

    public int getCantPremium() {
        return cantPremium;
    }

    public int getCantSuper() {
        return cantSuper;
    }

    public int getCantVentasGasoil() {
        return cantVentasGasoil;
    }

    public int getCantVentasPremium() {
        return cantVentasPremium;
    }

    public int getCantVentasSuper() {
        return cantVentasSuper;
    }

    public void llenarDepositoGasoil() {
        this.cantGasoil = this.maximaCarga;
    }

    public void llenarDepositoPremium() {
        this.cantPremium = this.maximaCarga;
    }

    public void llenarDepositoSuper() {
        this.cantSuper = this.maximaCarga;
    }

    public int getLitrosGasoilVendidos() {
        return litrosGasoilVendidos;
    }

    public int getLitrosPremiumVendidos() {
        return litrosPremiumVendidos;
    }

    public int getLitrosSuperVendidos() {
        return litrosSuperVendidos;
    }
}
