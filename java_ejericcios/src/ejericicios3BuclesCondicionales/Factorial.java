package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class Factorial {

	public static void main(String[] args) {
		/* Pedir un número y calcular su factorial. */

		System.out.println("pon un numero");
		int dato = Entrada.entero();
		int factorial = 1;
		for (int i = 1; i <= dato; i++) {
			factorial *= i;
		}

		System.out.println("factorial es " + factorial);
	}

}
