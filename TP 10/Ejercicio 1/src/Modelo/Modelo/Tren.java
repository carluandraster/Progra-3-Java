package Modelo;

import Modelo.Monitores.*;

public class Tren extends Thread{
    private String name;
    private MonitorCaso4 recursoCompartido;
    private boolean sentido;

    public Tren(String name, MonitorCaso4 recursoCompartido) {
        this.name = name;
        this.recursoCompartido = recursoCompartido;
    }

    public Tren(String name, MonitorCaso4 recursoCompartido, boolean sentido){
        this(name,recursoCompartido);
        this.sentido = sentido;
    }

    @Override
    public void run() {
        this.recursoCompartido.entrar(this.name,this.sentido);
        
        System.out.println(this.name + " cruzando tramo compartido...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.recursoCompartido.salir(this.name);
    }
}
