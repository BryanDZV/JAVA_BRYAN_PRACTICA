package ejericiciosConIterativas;

public class Secuencia2a100 {

	public static void main(String[] args) {
		/*
		 * Secuencia2a100 Crea un algoritmo que nos muestre los números pares desde el 2
		 * hasta el 100 (incrementado de 2 en 2).
		 */

		for (int i = 2; i < 101; i++) {

			System.out.println("numero:  " + i);
			i += 1;
		}
		
		System.out.println("**********************************");
		for (int i = 2; i < 101; i+=2) {

			System.out.println("numero:  " + i);
			
		}

	}

}
