package paquete1;

import java.util.Random;

import excepciones.Menor100Exception;
import excepciones.Menor25Exception;
import excepciones.Menor50Exception;
import excepciones.Menor75Exception;

public class ClaseUno {

	private static int numero;

	public static int devuelveNumero() {

		return numero = (int) (Math.random() * 100 + 0);
	}

	public static void chequeaExceptionNumero(int numeroDado)
			throws Menor25Exception, Menor50Exception, Menor75Exception, Menor100Exception {
		if (numeroDado >= 1 && numeroDado < 25) {
			throw new Menor25Exception("El numero está entre 1 y 25");
		} else if (numeroDado > 25 && numeroDado < 50) {
			throw new Menor50Exception("El numero está entre 25 y 50");
		} else if (numeroDado > 50 && numeroDado < 75) {
			throw new Menor75Exception("El numero está entre 50 y 75");
		} else if (numeroDado > 75 && numeroDado < 100) {
			throw new Menor100Exception("El numero está entre 75 y 100");
		}
		else if (numeroDado == 25 || numeroDado == 50 || numeroDado == 75 || numeroDado == 100) {
			System.out.println("No hay excepciones");
		}
	}

	public static void main(String[] args) {

//		ClaseUno numero1 = new ClaseUno();
//
//		System.out.println(numero1.devuelveNumero());
	}

}
