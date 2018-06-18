package JuegoPruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



import Juego.carta;
import Juego.jugador;
import Juego.mesa;
import Juego.naipe;
import Juego.repartidor;

public class JuegoTest {

	//@Test
	public void testRangoCarta() {
		
		//assertEquals(Exception,carta nuevaCarta = new carta("2","palos",-2);
		
	}
	
		@Test
		public void testValorCartaIgual() throws Exception {
			
			carta nuevaCarta1 = new carta("2","palos",2);
			carta nuevaCarta2 = new carta("2","escudos",2);
			
			
		
			assertEquals(false,nuevaCarta2.equals("2"));
			
			
		}
		
		@Test
		public void testTamannoNaipe() throws Exception {
			
			
			naipe nuevoNaipe = new naipe(1);
			
		
			
			assertEquals(52,nuevoNaipe.getLenght());
			
		}
		
		//@Test
		//public void testTamannoMano() throws Exception  {
			
			//naipe nuevoNaipe2 = new naipe(2);
			//repartidor Repe = new repartidor(nuevoNaipe2);
			
		
			
			//assertEquals(4,Repe.getLenght(nuevoNaipe2));
			
		//}
		
		//@Test
		//public void testJugadorCartas() throws Exception {
			
			
			//naipe nuevoNaipe3 = new naipe(3);
			//repartidor Repe = new repartidor(nuevoNaipe3);
			//List<List<carta>> masos =Repe.Repartir(nuevoNaipe3);
			
			//for(List<carta> maso : masos) {
			//	jugador Jugador =new jugador("Player"+maso.size());
			//}
			
			
			
			
		
			
			//assertEquals(2,Repe.getLenght(nuevoNaipe3));
			
		//}
		
		@Test
		public void testMesa0() throws Exception {
			
			
			naipe nuevoNaipe3 = new naipe(3);
			repartidor Repe = new repartidor(nuevoNaipe3);
			
			mesa Mesa1 =new mesa(Repe);	
			assertEquals(0,Mesa1.getNumeroJugadores());
}
		
		
		@Test
		public void testDarCartaJugador() throws Exception {
			
			
			naipe nuevoNaipe4 = new naipe(4);
			repartidor Repe = new repartidor(nuevoNaipe4);
			List<carta> manoTemporal=null;
			jugador Jugador =new jugador("Esteban");
			Repe.DarCarta(Jugador);
			
			mesa Mesa1 =new mesa(Repe);	
			assertEquals(51,nuevoNaipe4.getLenght());
			
}
		
		@Test
		public void testEmpezarPartida() throws Exception {
			
			
			naipe nuevoNaipe4 = new naipe(4);
			repartidor Repe = new repartidor(nuevoNaipe4);
			
			
			jugador Jugador =new jugador("Esteban");
			jugador Jugador2 =new jugador("Mario");
			List<jugador> jugadores = new ArrayList<>();
			Repe.DarCarta(Jugador);
			jugadores.add(Jugador);
			jugadores.add(Jugador2);
			mesa Mesa1 =new mesa(Repe);
			Mesa1.addPlayers(jugadores);
			Mesa1.EmpezarAJugar21();
			assertEquals(2,Jugador.getLenght());
			
}
		
		@Test
		public void testEmpezarPartidaDeRon() throws Exception {
			
			
			naipe nuevoNaipe4 = new naipe(4);
			repartidor Repe = new repartidor(nuevoNaipe4);
			
			
			jugador Jugador =new jugador("Esteban");
			jugador Jugador2 =new jugador("Mario");
			List<jugador> jugadores = new ArrayList<>();
			Repe.DarCarta(Jugador);
			jugadores.add(Jugador);
			jugadores.add(Jugador2);
			mesa Mesa1 =new mesa(Repe);
			Mesa1.addPlayers(jugadores);
			Mesa1.EmpezarAJugarRon();
			assertEquals(7,Jugador.getLenght());
			
}
}
