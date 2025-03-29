import java.util.HashMap;
import java.util.Iterator;

public class Departamento {
    private String nombre;
    private HashMap<String, Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.put(empleado.getNombre(), empleado);
    }

    public void quitarEmpleado(String empleado) {
        this.empleados.remove(empleado);
    }

    public HashMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Empleado> it = this.empleados.values().iterator();
        sb.append(this.nombre + "\n");
        if (this.empleados.size() > 0) {
            sb.append("Planilla de empleados\n");
            sb.append("Nombre \t\t Sueldo\n");
            while (it.hasNext())
                sb.append(it.next() + "\n");
        }
        return sb.toString();
    }
}
