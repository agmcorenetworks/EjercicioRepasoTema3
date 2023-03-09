package paquete2;

import ejercicioRepaso.primerPaquete.ClaseUno;
import exceptions.Menor100Exception;
import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;

public class ChequeaNumeros {
		private static final int lista[] = new int[100];
		public static final int NUMERO_DE_ALEATORIOS = 100;
		public ChequeaNumeros() {
			for(int i = 0; i<NUMERO_DE_ALEATORIOS;i++) {
				lista[i] = ClaseUno.numeroAleatorio();
			}
		}
		
		
		
		
		
		public static void chequeaNumeros() {
			for (int i:lista) {
				try {
					ClaseUno.chequeaExceptionNumero(lista[i]);
				} catch (Menor25Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (Menor50Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (Menor75Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (Menor100Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
		public static void main(String[] args) {
			ChequeaNumeros numeros = new ChequeaNumeros();
			chequeaNumeros();
		}
	}


