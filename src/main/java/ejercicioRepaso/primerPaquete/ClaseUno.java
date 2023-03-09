package ejercicioRepaso.primerPaquete;

import exceptions.Menor100Exception;
import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;

public class ClaseUno {
	public static int numeroAleatorio() {
		return (int) (Math.random()*101+0);
	}

	public static void chequeaExceptionNumero(int numero) throws Menor25Exception, Menor50Exception, Menor75Exception, Menor100Exception {
		if (numero < 25 && numero > 1) {
			throw new Menor25Exception("El numero está entre 1 y 25");
		}else if (numero < 50 && numero > 25) {
			throw new Menor50Exception("El numero está entre 25 y 50");
		}else if (numero < 75 && numero > 50) {
			throw new Menor75Exception("El numero está entre 50 y 75");
		}else if (numero < 100 && numero > 75) {
			throw new Menor100Exception("El numero está entre 75 y 100");
		}
	}
}
