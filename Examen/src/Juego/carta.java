package Juego;

import org.w3c.dom.ranges.RangeException;

public class carta {
	
	
	

	private String Nombre;
	private String Palo;
	private int Valor;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Valor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		carta other = (carta) obj;
		if (Valor != other.Valor)
			return false;
		return true;
	}

	
	
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
