public class Rubi implements Gema {
    @Override
    public String reaccionarCon(Gema otraGema) {
        return otraGema.reaccionar("Rubi");
    }

    @Override
    public String reaccionar(String reactivo) {
        String aux;
        if (reactivo.equalsIgnoreCase("RUBI")) {
            aux = "Lluvia de fuego";
        } else {
            if (reactivo.equalsIgnoreCase("ZAFIRO")) {
                aux = "Erupcion Volcánica";
            } else {
                if (reactivo.equalsIgnoreCase("ESMERALDA")) {
                    aux = "Terremoto";
                } else {
                    aux = "Tormenta de Rayos";
                }
            }
        }
        return aux;
    }
}
