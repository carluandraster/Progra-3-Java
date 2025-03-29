import java.util.HashMap;
import java.util.Iterator;

public class Empresa {
    private static Empresa _instancia = null;
    private HashMap<String, Departamento> departamentos;

    private Empresa() {
        this.departamentos = new HashMap<>();
    }

    public static Empresa getInstancia() {
        if (_instancia == null)
            _instancia = new Empresa();
        return _instancia;
    }

    public void agregarDepartamento(Departamento departamento) {
        this.departamentos.put(departamento.getNombre(), departamento);
    }

    public void eliminarDepartamento(String departamento) {
        this.departamentos.remove(departamento);
    }

    public HashMap<String, Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Departamento> it = this.departamentos.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("----------------------------------\n");
        }
        return sb.toString();
    }
}
