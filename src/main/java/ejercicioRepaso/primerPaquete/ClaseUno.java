package ejercicioRepaso.primerPaquete;

import java.util.Random;

public class ClaseUno {

	
	public static int numAleatorios() {
		Random aleatorio = new Random();
		
		int generador = aleatorio.nextInt(100) +1;
		return generador;
	}
	
	
}
