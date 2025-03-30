package Ejercicio6;

public class Prueba {
    public static void main(String[] args) {
        SistemaDeArchivos sis = SistemaDeArchivos.getInstancia();
        Directorio fotos, viaje, misDocumentos, mp3, queen, theBeatles;
        sis.agregar(new Archivo("Recordatorio.txt", 5));
        fotos = new Directorio("fotos");
        sis.agregar(fotos);
        fotos.agregar(new Archivo("CAM00053.jpg", 150));
        fotos.agregar(new Archivo("CAM00054.jpg", 200));
        fotos.agregar(new Archivo("CAM00055.jpg", 170));
        fotos.agregar(new Archivo("CAM00056.jpg", 150));
        fotos.agregar(new Archivo("CAM00057.jpg", 250));
        viaje = new Directorio("viaje");
        fotos.agregar(viaje);
        viaje.agregar(new Link("Acceso directo a raiz.lnk", sis));
        viaje.agregar(new Archivo("DSC08904.JPG", 1500));
        viaje.agregar(new Archivo("DSC08909.JPG", 1000));
        viaje.agregar(new Archivo("DSC08910.JPG", 2000));
        viaje.agregar(new Archivo("DSC08911.JPG", 2500));
        sis.agregar(new Link("Acceso directo a DSC08910.JPG.lnk", sis.getSubdirectorios().get("fotos")
                .getSubdirectorios().get("viaje").getArchivos().get("DSC08910.JPG")));
        misDocumentos = new Directorio("mis documentos");
        sis.agregar(misDocumentos);
        misDocumentos.agregar(new Archivo("carta.doc", 30));
        misDocumentos.agregar(new Archivo("curriculum.doc", 60));
        misDocumentos.agregar(new Archivo("receta de cocina.doc", 80));
        mp3 = new Directorio("mp3");
        sis.agregar(mp3);
        mp3.agregar(new Archivo("El choclo.mp3", 3500));
        mp3.agregar(new Archivo("El dia que me quieras.Mp3", 4500));
        mp3.agregar(new Archivo("Naranjo en flor.MP3", 5000));
        queen = new Directorio("Queen");
        mp3.agregar(queen);
        queen.agregar(new Archivo("Bohemian Rhapsody.mp3", 5300));
        queen.agregar(new Archivo("Made in heave.mp3", 6500));
        queen.agregar(new Archivo("Save me.mp3", 2500));
        theBeatles = new Directorio("The beatles");
        mp3.agregar(theBeatles);
        theBeatles.agregar(new Archivo("Let it be.mp3", 3530));
        theBeatles.agregar(new Archivo("Yesterday.mp3", 3000));
        sis.agregar(new Link("Acceso directo a Save me.mp3.lnk", queen.getArchivos().get("Save me.mp3")));
        sis.agregar(new ArchivoComprimido("Queen.zip", queen, 0.8));
        sis.agregar(new ArchivoComprimido("Mis Documentos.zip", misDocumentos, 0.3));
        System.out.println(sis);
    }
}
