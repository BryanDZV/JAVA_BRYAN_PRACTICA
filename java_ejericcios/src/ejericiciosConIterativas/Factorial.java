package ejericiciosConIterativas;

import utilidades.Entrada;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Factorial Crea un algoritmo que nos muestre cuál es el factorial de un número
		 * que previamente pasará el usuario por teclado y que deberá ser mayor que 0.
		 * 
		 * n!=n*(n-1)*(n-2)...
		 * 
		 * f=n*todo los numeros anteriores a el hasta 1
		 * 
		 * 
		 * El i vale:1 → factorial = 1 × 1 = 1
		 * 
		 * 2 → factorial = 1 × 2 = 2
		 * 
		 * 3 → factorial = 2 × 3 = 6
		 * 
		 * 4 → factorial = 6 × 4 = 24
		 * 
		 * 5 → factorial = 24 × 5 = 120 ✅
		 */
		System.out.println("intrduce un numero para saber su factorial");

		int dato = Entrada.entero();
		int factorial = 1;
		for (int i = 1; i <= dato; i++) {
			factorial *= i;// aqui se incluye ya el n*(.....)
		}
		System.out.println(factorial);

	}

}
