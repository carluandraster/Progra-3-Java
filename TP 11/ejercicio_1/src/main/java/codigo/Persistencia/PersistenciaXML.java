package codigo.Persistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class PersistenciaXML implements IPersistencia<Serializable> {
    private FileInputStream fileInput;
    private FileOutputStream fileOutput;
    private XMLDecoder xmlDecoder;
    private XMLEncoder xmlEncoder;

    @Override
    public void abrirInput(String nombre) throws IOException {
        this.fileInput = new FileInputStream(nombre);
        this.xmlDecoder = new XMLDecoder(this.fileInput);
    }

    @Override
    public void abrirOutput(String nombre) throws IOException {
        this.fileOutput = new FileOutputStream(nombre);
        this.xmlEncoder = new XMLEncoder(this.fileOutput);
    }

    @Override
    public void cerrarOutput() throws IOException {
        if (this.xmlEncoder != null) {
            this.xmlEncoder.close();
        }
    }

    @Override
    public void cerrarInput() throws IOException {
        if (xmlDecoder != null) {
            this.xmlDecoder.close();
        }
    }

    @Override
    public void escribir(Serializable objeto) throws IOException {
        if (this.xmlEncoder != null) {
            this.xmlEncoder.writeObject(objeto);
        }
    }

    @Override
    public Serializable leer() throws IOException, ClassNotFoundException {
        Serializable aux = null;
        if (this.xmlDecoder != null) {
            aux = (Serializable) this.xmlDecoder.readObject();
        }
        return aux;
    }

}
