package Juego;

import java.util.List;

public class jugador {
	
	private String Nombre;
	private List<carta> mano;
	public jugador(String nombre, List<carta> mano) {
		super();
		Nombre = nombre;
		this.mano = mano;
	}
	

}
