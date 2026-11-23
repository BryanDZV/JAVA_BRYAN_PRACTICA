package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class NumerosHastaN {

	public static void main(String[] args) {
		/* Pedir un número N, y mostrar todos los números del 1 al N. */
		
		boolean salir=false;
		int dato=0;
		System.out.println("pon un numero");
		dato=Entrada.entero();
		
		for(int i=1;i<=dato;i++) {
			System.out.println(i);
			
		}
	}

}
