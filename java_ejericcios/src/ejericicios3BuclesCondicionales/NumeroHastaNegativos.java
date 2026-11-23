package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class NumeroHastaNegativos {

	public static void main(String[] args) {
		//  Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han
		//introducido.
		
		boolean salir=false;
		int cnt=0;
		do {
			System.out.println("pon un numero");
			int dato=Entrada.entero();
			if (dato<0) {
				System.out.println("saliendo");
				salir=true;
			}else {
				cnt++;
			}
		} while (!salir);
		
		System.out.println("Numero introducidos son "+cnt);

	}

}
