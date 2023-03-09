package paquete2;
import paquete1.*;
public class ChequeaNumeros {
	static int[] num;
	public ChequeaNumeros() {
		num = new int [100];
		for (int i = 0; i<99;i++) {
			num[i] = NumeroAleatorio.aleatorio();
		}
	}
	public static void main(String[] args) {
		ChequeaNumeros lista = new ChequeaNumeros();
		for(int i:num) {
			System.out.println(num[i]);
		}
	}
}
