package Juego;

import java.util.List;

public class mesa {
	
	private int numeroJugadores;
	private repartidor Repartidor;
	private List<jugador> jugadores;
	
	public mesa(repartidor repartidor) {
		super();
		Repartidor = repartidor;
		this.jugadores = null;
		this.numeroJugadores=0;
	}

	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}

	public List<jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
}
