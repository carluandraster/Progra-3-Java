package Ejercicio5.b;

import Ejercicio5.a.*;

public class PersonaConMascota extends Persona {
    private Animal mascota;

    public PersonaConMascota() {
        super();
    }

    public PersonaConMascota(String nombre, int dni, Domicilio domicilio) {
        this.apellido = nombre;
        this.DNI = dni;
        this.domicilio = domicilio;
    }

    public PersonaConMascota(String nombre, int dni, Domicilio domicilio, Animal mascota) {
        this(nombre, dni, domicilio);
        this.mascota = mascota;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PersonaConMascota aux;
        try {
            aux = (PersonaConMascota) super.clone();
            aux.mascota = (Animal) mascota.clone();
            return aux;
        } catch (CloneNotSupportedException e) {
            System.err.println("No es posible clonar a la persona porque tiene de mascota a un animal no clonable");
            throw new InternalError(e.toString());
        }
    }

    public Animal getMascota() {
        return mascota;
    }
}
