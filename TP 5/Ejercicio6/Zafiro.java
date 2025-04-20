public class Zafiro implements Gema {
    @Override
    public String reaccionarCon(Gema otraGema) {
        return otraGema.reaccionar("Zafiro");
    }

    @Override
    public String reaccionar(String reactivo) {
        String aux;
        if (reactivo.equalsIgnoreCase("RUBI")) {
            aux = "Erupcion Volcanica";
        } else {
            if (reactivo.equalsIgnoreCase("ZAFIRO")) {
                aux = "Inundacion";
            } else {
                if (reactivo.equalsIgnoreCase("ESMERALDA")) {
                    aux = "Huracan";
                } else {
                    aux = "Granizo Asesino";
                }
            }
        }
        return aux;
    }
}
