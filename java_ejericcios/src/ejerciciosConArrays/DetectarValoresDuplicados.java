package ejerciciosConArrays;

import utilidades.Entrada;

public class DetectarValoresDuplicados {

	public static void main(String[] args) {
		/*
		 * Pide 10 números. Muestra si hay algún valor repetido. Objetivo: Comparaciones
		 * de elementos con otros (i ≠ j).
		 */
		boolean salir = false;
		int[] arrayFinal = new int[4];
		int cnt = 1;
		for (int i = 0; i < arrayFinal.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("introduce 10 numeros:");
				System.out.println("Numero :: " + cnt);
				String dato = Entrada.cadena();
				if (!validacion(dato)) {
					System.out.println("solo numeros vuelve A INTENTARLO");
				} else {
					int numero = Integer.parseInt(dato);
					arrayFinal[i] = numero;
					cnt++;
					salir = true;
				}

			}
		}
		System.out.println("array lleno");
		int contadorRepetido = 0;
		for (int i = 0; i < arrayFinal.length; i++) {
			for (int j = i+1; j < arrayFinal.length; j++) {
				if (arrayFinal[i]==arrayFinal[j]) {
					contadorRepetido++;
				}
			}
		}
		System.out.println("repetidos::::" + contadorRepetido);
	}

	private static boolean validacion(String dato) {

		return dato.matches("[0-9]+");

	}

}
