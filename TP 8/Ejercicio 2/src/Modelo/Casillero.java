package Modelo;

public class Casillero {
	private boolean pisado;
	private boolean mina;
	private int cantidadEntorno;
	private boolean marcado;
	
	public Casillero(boolean mina) {
		super();
		this.mina = mina;
		this.pisado = false;
		this.marcado = false;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	public void marcar() {
		this.marcado = !this.marcado;
	}
	public boolean isPisado() {
		return pisado;
	}
	public void pisar() {
		this.pisado = true;
	}
	public boolean isMina() {
		return mina;
	}
	public int getCantidadEntorno() {
		return cantidadEntorno;
	}
	public void setCantidadEntorno(int cantidadEntorno) {
		this.cantidadEntorno = cantidadEntorno;
	}
}
