package ejerciciosConArrays;

import utilidades.Entrada;

public class EliminarValor {

	public static void main(String[] args) {
		/*
		 * EliminarValor
		 * 
		 * Pide 10 números. Luego pide uno y crea un array nuevo sin ese valor.
		 * Objetivo: Validar condición para copiar. 💡 Usa un contador de posición para
		 * el nuevo array.
		 */

		int[] arrayNumeros = new int[11];
		boolean salir = false;
		for (int i = 0; i < arrayNumeros.length; i++) {
			salir = false;
			while (!salir) {
				if (i == arrayNumeros.length - 1) {
					System.out.println("ultimo numero no introducir");
					String datoUltimo = Entrada.cadena();
					if (!validacion(datoUltimo)) {
						System.out.println("solo numeros");
					} else {
						arrayNumeros[i] = Integer.parseInt(datoUltimo);
						salir = true;

					}
				} else {
					System.out.println("introduce 10 numeros");
					String dato = Entrada.cadena();
					if (!validacion(dato)) {
						System.out.println("solo numeros");
					} else {
						arrayNumeros[i] = Integer.parseInt(dato);
						salir = true;

					}
				}

			}

		}
		int[] nuevoArray = new int[10];
		int indice=0;
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] != arrayNumeros[arrayNumeros.length - 1]) {
				nuevoArray[indice] = arrayNumeros[i];
				indice++;

			}
		}
		System.out.println("FINAL ARRAY");
		for (int i : nuevoArray) {
			System.out.println(i);
		}

	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
