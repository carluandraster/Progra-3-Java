public class PersonajeFactory {
    private static PersonajeFactory _instancia = null;

    private PersonajeFactory() {
    }

    public static PersonajeFactory getInstancia() {
        if (_instancia == null) {
            _instancia = new PersonajeFactory();
        }
        return _instancia;
    }

    // Personaje sin decorador
    public Personaje crearPersonaje(String tipo) {
        Personaje base;
        if (tipo.equalsIgnoreCase("MAGO")) {
            base = new Mago();
        } else {
            if (tipo.equalsIgnoreCase("ELFO")) {
                base = new Elfo();
            } else {
                if (tipo.equalsIgnoreCase(("HECHICERA"))) {
                    base = new Hechicera();
                } else {
                    if (tipo.equalsIgnoreCase("DRAGON")) {
                        base = new Dragon();
                    } else {
                        base = new Guerrero();
                    }
                }
            }
        }
        return base;
    }

    // Personaje con decorador
    public IPersonaje crearPersonaje(String tipo, String decorador) {
        Personaje base = this.crearPersonaje(tipo);
        Decorador personajeDecorado;

        if (decorador.equalsIgnoreCase("TIERRA")) {
            personajeDecorado = new Tierra(base);
        } else {
            if (decorador.equalsIgnoreCase("AIRE")) {
                personajeDecorado = new Aire(base);
            } else {
                if (decorador.equalsIgnoreCase("AGUA")) {
                    personajeDecorado = new Agua(base);
                } else {
                    personajeDecorado = new Fuego(base);
                }
            }
        }
        return personajeDecorado;
    }
}