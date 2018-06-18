package Juego;

import java.util.List;

public class deck {
	private naipe naipeCompleto;
	public void DarCarta  (jugador pjugador) {
		List<carta> cartas= naipeCompleto.getCartas();
		
		
		carta Carta = cartas.get(cartas.size() - 1);
		naipeCompleto.eliminarCarta(Carta);
 		
	}
}
