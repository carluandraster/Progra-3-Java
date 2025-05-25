import Controlador.Controlador;
import Vista.Formulario;
import Vista.Tablero;

public class Prueba {

	public static void main(String[] args) {
		new Controlador(new Formulario(), new Tablero());
	}

}
