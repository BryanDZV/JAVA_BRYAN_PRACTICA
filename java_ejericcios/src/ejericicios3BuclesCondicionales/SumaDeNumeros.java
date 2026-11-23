package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class SumaDeNumeros {

	public static void main(String[] args) {
		/* Pedir 15 números y escribir la suma total.*/
		
		int cantidad=15;
		int cnt=1;
		int sumaTotal=0;
		while (cnt<=15) {
			System.out.println("numero "+cnt);
			int dato=Entrada.entero();
			sumaTotal+=dato;
			cnt++;
		}
		System.out.println("la suma es "+sumaTotal);

	}

}
