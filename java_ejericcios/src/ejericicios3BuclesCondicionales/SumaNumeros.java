package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class SumaNumeros {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
		 * introducidos.
		 */

		boolean salir = false;
		boolean primerNumero = true;
		int sumaNumeros = 0;
		do {
			System.out.println("pon un numero");
			int dato = Entrada.entero();
			if (dato == 0) {
				System.out.println("terminando");
				salir = true;
			} else {

				if (primerNumero) {
					sumaNumeros = dato;
					primerNumero = false;
				} else {
					sumaNumeros += dato;
				}
			}
		} while (!salir);
		
		System.out.println("suma total es "+ sumaNumeros);

	}

}
