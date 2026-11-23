package ejerciciosConArrays;

import utilidades.Entrada;

public class RellenarArrayYMostrar {

	public static void main(String[] args) {
		/*
		 * Pide al usuario 10 números y guárdalos en un array. Luego muéstralos uno por
		 * uno con su índice correspondiente.
		 */

		int[] array = new int[10];
		System.out.println("introduce 10 Numeros");
		for (int i = 0; i < array.length; i++) {
			boolean salir = false;
			while (!salir) {
				System.out.println("numero  :" + (i + 1));
				String dato = Entrada.cadena();
				if (validacion(dato)) {
					array[i] = Integer.parseInt(dato);
					salir = false;

				} else {
					System.out.println("solo numeros");
				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("POSICION :" + i + "\nNumero  :" + array[i]);
			System.out.println("*****");
		}

	}

	private static boolean validacion(String dato) {
		boolean salir = false;
		if (!dato.matches("[0-9]+")) {
			System.out.println("solo numeros");

		} else {

			salir = true;
		}
		return salir;

	}

}
