package codigo.Persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBinaria implements IPersistencia<Serializable> {
    private FileOutputStream fileOutput;
    private FileInputStream fileInput;
    private ObjectOutputStream objectOutput;
    private ObjectInputStream objectInput;

    @Override
    public void abrirInput(String nombre) throws IOException {
        this.fileInput = new FileInputStream(nombre);
        this.objectInput = new ObjectInputStream(fileInput);
    }

    @Override
    public void abrirOutput(String nombre) throws IOException {
        this.fileOutput = new FileOutputStream(nombre);
        this.objectOutput = new ObjectOutputStream(fileOutput);
    }

    @Override
    public void cerrarOutput() throws IOException {
        if (this.objectOutput != null) {
            this.objectOutput.close();
        }
    }

    @Override
    public void cerrarInput() throws IOException {
        if (this.objectInput != null) {
            this.objectInput.close();
        }
    }

    @Override
    public void escribir(Serializable objeto) throws IOException {
        if (this.objectOutput != null) {
            this.objectOutput.writeObject(objeto);
        }
    }

    @Override
    public Serializable leer() throws IOException, ClassNotFoundException {
        Serializable aux = null;
        if (this.objectInput != null) {
            aux = (Serializable) this.objectInput.readObject();
        }
        return aux;
    }

}
