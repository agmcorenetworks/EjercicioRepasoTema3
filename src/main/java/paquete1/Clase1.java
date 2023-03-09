package paquete1;

import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;
import exceptions.Menor100Exception;

public class Clase1 {
	
	private static int numero;
		
		
		public static int numAleatorio(){
			
			
				return numero = (int) (Math.random()*100 + 0);
			
			} 
		
		
		
		
		public static void chequeaExcepcionNumero(int numero) throws Menor25Exception, Menor50Exception, Menor75Exception, Menor100Exception {
			if(numero < 25 && numero >= 1) {
				
				 throw new Menor25Exception("El numero esta entre 1 y 25");
			}else if(numero >25 && numero <50){
				
				throw new Menor50Exception("El numero esta entre 25 y 50");
				
			}else if(numero >50 && numero <75){
				
				throw new Menor75Exception("El numero esta entre 50 y 75");
				
			}else if(numero >75 && numero <100){
				
				throw new Menor100Exception("El numero esta entre 75 y 100");
			   
			}else if(numero == 25 || numero == 50 || numero == 75 || numero == 100) {
				
				System.out.println("Numero cuartil");
			}
			
			
			
			
			
			
		}
			
		public static void main(String []args ) {
			Clase1 c1 = new Clase1();
			
			
			System.out.println(c1.numAleatorio());
		}
			
			
		}
		
		
		
	


