package testEjercicio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import paquete1.ClaseUno;
import paquete2.ChequeaNumeros;

public class TestJunit {
	
	@Test
	public void testNumeroAleatorio() {
				
		assertTrue(ChequeaNumeros.NUMERO_DE_ALEATORIO==100);	 	
		int testNumber;
		
		for (int x = 0; x < ChequeaNumeros.NUMERO_DE_ALEATORIO; x++) {
			testNumber= ClaseUno.devuelveNumero();
			assertTrue(testNumber>=0 && testNumber<=ChequeaNumeros.NUMERO_DE_ALEATORIO);
		}
			
 
	}

}
