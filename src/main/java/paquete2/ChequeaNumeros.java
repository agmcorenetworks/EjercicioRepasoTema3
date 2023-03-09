package paquete2;

import exceptions.Menor100Exception;
import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;
import paquete1.Clase1;


public class ChequeaNumeros {
	
	
	public final static int NUMERO_DE_ALEATORIO = 100;
	int[] miArray = new int[NUMERO_DE_ALEATORIO];
	
	
	
	public ChequeaNumeros(){
			
		
		for (int i = 0; i < miArray.length; i++) {
	    	
		      miArray[i] = Clase1.numAleatorio();
		      
		      
		    }
		
		
	}
	
	
	public  void chequearNumeros() {
		
		for (int i = 0; i < miArray.length; i++) {
	    	
		
		    try {
				Clase1.chequeaExcepcionNumero(miArray[i]);
			} catch (Menor25Exception e) {
				
				System.out.println(e.getMessage());
			} catch (Menor50Exception e) {
				
				System.out.println(e.getMessage());
			} catch (Menor75Exception e) {
				
				System.out.println(e.getMessage());
			} catch (Menor100Exception e) {
				
				System.out.println(e.getMessage());
			}
		    }
		
		
	}
	
	

	public static void main(String[] args) {

		ChequeaNumeros c1 = new ChequeaNumeros();
		
		c1.chequearNumeros();
		
		
	}

}
