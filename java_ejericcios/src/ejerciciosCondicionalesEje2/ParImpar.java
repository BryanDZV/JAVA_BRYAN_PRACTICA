package ejerciciosCondicionalesEje2;

import utilidades.Entrada;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * ParImpar Crea un algoritmo que solicite un número positivo (>0) al usuario, y
		 * nos muestre si el valor introducido es par o impar. Avisar al usuario con un
		 * mensaje en caso de introducir un número negativo.
		 */

		System.out.println("indtrducir numero");
		String numero = Entrada.cadena();

		if (numero.matches("[^0-9]")) {
			System.out.println("solo numero");

		} else if (Integer.parseInt(numero) < 0) {
			System.out.println("solo numero Positivos");
		} else {

			if (esParImpar(Integer.parseInt(numero))) {
				System.out.println("es par");
			} else {
				System.out.println("es impar");
			}

		}

	}

	private static boolean esParImpar(int numero) {
		boolean par = false;

		if (numero % 2 == 0) {
			par = true;
		}
		return par;
	}

}
