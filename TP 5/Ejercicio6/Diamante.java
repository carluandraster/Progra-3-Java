public class Diamante implements Gema {
    @Override
    public String reaccionarCon(Gema otraGema) {
        return otraGema.reaccionar("Diamante");
    }

    @Override
    public String reaccionar(String reactivo) {
        String aux;
        if (reactivo.equalsIgnoreCase("RUBI")) {
            aux = "Tormenta de Rayos";
        } else {
            if (reactivo.equalsIgnoreCase("ZAFIRO")) {
                aux = "Granizo Asesino";
            } else {
                if (reactivo.equalsIgnoreCase("ESMERALDA")) {
                    aux = "Vientos venenosos";
                } else {
                    aux = "Congelamiento";
                }
            }
        }
        return aux;
    }
}
