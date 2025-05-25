package Modelo;

import java.util.Random;

import Modelo.Excepciones.*;

public class Buscaminas {
	private int ancho;
	private int alto;
	private int cantidadDeMinas;
	private Casillero[][] matriz;
	private int pisadas;

	public Buscaminas(int ancho, int alto, int cantidadDeMinas) throws ParametrosInvalidosException {
		if (ancho>0)
			this.ancho = ancho;
		else
			throw new ParametrosInvalidosException("El ancho debe ser mayor a 0", alto, ancho, cantidadDeMinas);
		if (alto>0)
			this.alto = alto;
		else
			throw new ParametrosInvalidosException("El alto debe ser mayor a 0", alto, ancho, cantidadDeMinas);
		if (cantidadDeMinas <= 0)
			throw new ParametrosInvalidosException("La cantidad de minas debe ser mayor a 0", alto, ancho, cantidadDeMinas);
		else
			if(cantidadDeMinas > ancho*alto)
				throw new ParametrosInvalidosException("No puede haber más minas que casilleros en el tablero", alto, ancho, cantidadDeMinas);
			else
				this.cantidadDeMinas = cantidadDeMinas;
		
		this.pisadas = 0;
		
		// Inicializar matriz
		this.matriz = new Casillero[alto][ancho];
		Random r = new Random();
		int i,j;
		for(int c = 0; c<cantidadDeMinas; c++) {
			do {
				i = r.nextInt(alto);
				j = r.nextInt(ancho);
			}while (matriz[i][j] != null);
			matriz[i][j] = new Casillero(true);
		}
		for(i = 0; i<alto; i++)
			for(j = 0; j<ancho; j++)
				if(matriz[i][j] == null) {
					matriz[i][j] = new Casillero(false);
					matriz[i][j].setCantidadEntorno(this.cuenta(i, j));
				}
	}

	private int cuenta(int i, int j) {
		int respuesta = 0;
		int ii, jj;
		for (ii = i - 1; ii <= i + 1; ii++)
		    for (jj = j - 1; jj <= j + 1; jj++)
		    	if ((ii >= 0) && (ii < this.alto) && (jj >= 0) && (jj < this.ancho) && matriz[ii][jj] != null && matriz[ii][jj].isMina())
		    		respuesta++;
		return respuesta;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

	public int getCantidadDeMinas() {
		return cantidadDeMinas;
	}

	public int getMinasCercanas(int i, int j) throws FueraTableroException {
		if(i<0 || i> this.alto)
			throw new FueraTableroException("El parámetro i está por fuera del rango permitido", i, j);
		else
			if(j<0 || j> this.alto)
				throw new FueraTableroException("El parámetro j está por fuera del rango permitido", i, j);
			else
				return this.matriz[i][j].getCantidadEntorno();
	}
	
	public boolean isMina (int i, int j) throws FueraTableroException{
		if(i<0 || i> this.alto)
			throw new FueraTableroException("El parámetro i está por fuera del rango permitido", i, j);
		else
			if(j<0 || j> this.alto)
				throw new FueraTableroException("El parámetro j está por fuera del rango permitido", i, j);
			else
				return this.matriz[i][j].isMina();
	}
	
	public int getPisadas() {
		return pisadas;
	}

	public void setPisadas(int pisadas) {
		this.pisadas = pisadas;
	}

	public Casillero[][] getMatriz() {
		return matriz;
	}

	public void pisar(int i, int j) {
		int ii;
		int jj;
		this.matriz[i][j].pisar();
		if (this.matriz[i][j].getCantidadEntorno() == 0)
			for(ii = i-1;ii<=i+1; ii++)
				for(jj = j-1;jj<=j+1; j++)
					if(ii>= 0 && ii<this.alto && jj>= 0 && jj<this.ancho)
						this.pisar(ii, jj);
	}
}
