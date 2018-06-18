package Juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class repartidor {

	private naipe naipeCompleto;
	
	public List<List<carta>> Repartir(naipe pnaipe){
		List<carta> cartas= pnaipe.getCartas();
		cartas=repartidor.barajar(cartas);
		List<carta> maso1 =cartas.subList(0, 12);
		List<carta> maso2 =cartas.subList(13, 25);
		List<carta> maso3 =cartas.subList(26, 38);
		List<carta> maso4 =cartas.subList(39, 51);
		List<List<carta>> masos=null;
		masos.add(maso1);
		masos.add(maso2);
		masos.add(maso3);
		masos.add(maso4);
		return masos;
	
	}
	public void DarCarta  (jugador pjugador) {
		List<carta> cartas= naipeCompleto.getCartas();
		
		
		carta Carta = cartas.get(cartas.size() - 1);
		naipeCompleto.eliminarCarta(Carta);
 		
	}

	public repartidor(naipe naipeCompleto) {
		super();
		this.naipeCompleto = naipeCompleto;
	}
	
	//
	
	static List<carta> barajar(List<carta> pCartas)
	  {
	  Collections.shuffle(pCartas);
	    
	      
	      return pCartas;
	    }
	
	public int getLenght(naipe pnaipe) {
		
		List<List<carta>> lista = Repartir(pnaipe);
		int cadaMano =lista.size();
		
		return cadaMano;
	}
	
	
}
