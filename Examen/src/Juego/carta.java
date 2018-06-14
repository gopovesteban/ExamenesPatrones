package Juego;

import org.w3c.dom.ranges.RangeException;

public class carta {
	
	private String Nombre;
	private String Palo;
	private int Valor;
	
	public carta(String nombre, String palo, int valor) throws Exception {
		super();
		
		if (valor < 1 || valor > 10) {
			throw new Exception("El valor de la carta no se encuentra entre 1 y 10");
		}
		else {
		Nombre = nombre;
		Palo = palo;
		Valor = valor;
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPalo() {
		return Palo;
	}

	public void setPalo(String palo) {
		Palo = palo;
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	

}
