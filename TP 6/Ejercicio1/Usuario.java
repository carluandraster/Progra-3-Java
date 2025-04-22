public class Usuario {
    private String nombre;
    private String contrasenia;
    
    public Usuario(String nombre, String contrasenia) throws NombreInvalidoException, ContrasenaInvalidaException{
        this.setNombre(nombre);
        this.setContrasenia(contrasenia);
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null) {
            throw new NombreInvalidoException("El nombre debe ser distinto de NULL");
        } else {
            if (nombre == "") {
                throw new NombreInvalidoException("El nombre no puede ser un string vacio");
            } else {
                this.nombre = nombre;
            }
        }
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) throws ContrasenaInvalidaException{
        char primerCaracter;
        if (contrasenia == null) {
            throw new ContrasenaInvalidaException("La contrasenia debe ser distinta de NULL");
        } else {
            if (contrasenia.length() <= 6) {
                throw new ContrasenaInvalidaException("La contrasenia debe contener mas de 6 caracteres");
            } else {
                primerCaracter = contrasenia.charAt(0);
                if (primerCaracter >= 'a' && primerCaracter <= 'z' || primerCaracter >= 'A' && primerCaracter <= 'Z') {
                    this.contrasenia = contrasenia;
                } else {
                    throw new ContrasenaInvalidaException("El primer caracter de la contrasenia debe ser una letra");
                }
            }
        }
    }

    
}
