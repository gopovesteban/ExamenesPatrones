package JuegoPruebas;

import static org.junit.Assert.*;

import org.junit.Test;



import Juego.carta;
import Juego.naipe;

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
		public void testTamañoNaipe() throws Exception {
			
			
			naipe nuevoNaipe = new naipe(1);
			
		
			
			assertEquals(52,nuevoNaipe.getLenght());
			
		}
}
