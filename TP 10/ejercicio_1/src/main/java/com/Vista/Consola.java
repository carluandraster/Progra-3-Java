package com.Vista;

import java.util.Observable;
import java.util.Observer;

import com.Modelo.Mascota;

@SuppressWarnings("deprecation")
public class Consola implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        int necesidad = (int) arg;
        Mascota mascota = (Mascota) o;
        switch (necesidad) {
            case 0:
                System.out.println(mascota.getNombre() + " tiene sed");
                break;
            case 1:
                System.out.println(mascota.getNombre() + " tiene hambre");
                break;
            case 2:
                System.out.println(mascota.getNombre() + " está aburrido");
                break;
            default:
                throw new InternalError();
        }
    }

}
