package ejercicioRepasoTema3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ejercicioRepaso.primerPaquete.ClaseUno;
import ejercicioRepaso.segundoPaquete.ChequeaNumeros;

public class TestChequeNumeros {

	
	
	@Test
	public void testNumeroAleatorio() {
				
		assertTrue(ChequeaNumeros.NUMERO_DE_ALEATORIOS==100);		
		int testNumber;
		
		for (int x = 0; x < ChequeaNumeros.NUMERO_DE_ALEATORIOS; x++) {
			testNumber=ClaseUno.generaNumeroAleatorio();
			assertTrue(testNumber>=0 && testNumber<=ChequeaNumeros.NUMERO_DE_ALEATORIOS);
		}
			
 
	}
}
