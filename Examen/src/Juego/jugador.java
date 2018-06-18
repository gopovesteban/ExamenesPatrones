package Juego;

import java.util.Collections;
import java.util.List;

public class jugador {
	
	private String Nombre;
	private List<carta> mano;
	public jugador(String nombre) {
		super();
		Nombre = nombre;
	
		List<carta> myEmptyList = Collections.<carta>emptyList();
		this.mano = myEmptyList;
		
	}
	public void addCarta(carta pcarta) {
		mano.add(pcarta);
		
	}
	

}
