package ejercicioRepasoTema3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import paquete1.Clase1;
import paquete2.ChequeaNumeros;

public class TestChequeNumeros {

	
	
	@Test
	public void testNumeroAleatorio() {
				
		assertTrue(ChequeaNumeros.NUMERO_DE_ALEATORIO==100);		
		int testNumber;
		
		for (int x = 0; x < ChequeaNumeros.NUMERO_DE_ALEATORIO; x++) {
			testNumber=Clase1.numAleatorio();
			assertTrue(testNumber>=0 && testNumber<=ChequeaNumeros.NUMERO_DE_ALEATORIO);
		}
			
 
	}
}