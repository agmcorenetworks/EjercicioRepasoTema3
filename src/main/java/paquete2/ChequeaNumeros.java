package paquete2;

import java.util.Random;

import excepciones.Menor100Exception;
import excepciones.Menor25Exception;
import excepciones.Menor50Exception;
import excepciones.Menor75Exception;
import paquete1.ClaseUno;

public class ChequeaNumeros {
	
	//ATRIBUTO
	public final static int NUMERO_DE_ALEATORIO = 100; 
	private int[] mi_array = new int[NUMERO_DE_ALEATORIO];
	
	
	//CONSTRUCTOR
	public ChequeaNumeros() {
		 
		Random num_aleatorio = new Random();

		for (int i = 0; i < mi_array.length; i++) {
			mi_array[i] = ClaseUno.devuelveNumero();
			System.out.println(mi_array[i]);					
		}
	}
	
	public void chequeaNumeros() {
		for (int i = 0; i < mi_array.length; i++) {
			try {
				ClaseUno.chequeaExceptionNumero(mi_array[i]);
			} catch (Menor25Exception e) {
				System.out.println(	e.getMessage());
			} catch (Menor50Exception e) {
				System.out.println(	e.getMessage());
			} catch (Menor75Exception e) {
				System.out.println(	e.getMessage());
			} catch (Menor100Exception e) {
				System.out.println(	e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		ChequeaNumeros chequeo1 = new ChequeaNumeros();
		
		chequeo1.chequeaNumeros();
		
		

	}

}
