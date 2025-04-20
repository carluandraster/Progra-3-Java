public class Esmeralda implements Gema {
    @Override
    public String reaccionarCon(Gema otraGema) {
        return otraGema.reaccionar("Esmeralda");
    }

    @Override
    public String reaccionar(String reactivo) {
        String aux;
        if (reactivo.equalsIgnoreCase("RUBI")) {
            aux = "Terremoto";
        } else {
            if (reactivo.equalsIgnoreCase("ZAFIRO")) {
                aux = "Huracan";
            } else {
                if (reactivo.equalsIgnoreCase("ESMERALDA")) {
                    aux = "Niebla Desoladora";
                } else {
                    aux = "Vientos venenosos";
                }
            }
        }
        return aux;
    }
}
