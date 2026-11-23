package ejerciciosConArrays;

import utilidades.Entrada;

public class EstadisticaNumeros100_200 {

	public static void main(String[] args) {
		/*
		 * Escribe un algoritmo que lea números hasta que el usuario introduzca un cero,
		 * tras lo cual se mostrarán cuantas veces se ha repetido cada número
		 * introducido que esté dentro del intervalo 100..200 (ambos inclusive). Se
		 * validará que cada número introducido esté entre 100 y 200 ó bien sea 0
		 * (salir). En caso contrario se dará el correspondiente mensaje de error.
		 */

		boolean valido = false;
		int[] array = new int[101];
		int cantidadNumero = 0;

		for (int i = 0; i < array.length; i++) {
			valido = false;
			while (!valido) {
				System.out.println(
						"introce un numerO entre 100 y 200 ambos inclusive o 0 para MOSTRAR CATIDA DE NUMEROS REPETIDOS");
				String dato = Entrada.cadena();
				if (!validacion(dato)) {
					System.out.println("solo numeros");
				} else {
					if (Integer.parseInt(dato) == 0) {
						valido = true;
						i = array.length;
					} else {
						if (!validarRango(Integer.parseInt(dato))) {
							System.out.println("solo en el rango 100 y 200 ambos inclusive");
						} else {
							array[i] = Integer.parseInt(dato);
							cantidadNumero++;
							valido = true;

						}

					}

				}
			}
		}
		System.out.println("salida exitosa");
		System.out.println("RESULTADO");
		int repetido = 1;
		for (int i = 0; i < cantidadNumero; i++) {
			repetido = 1;
			if (array[i] != -1) {
				for (int j = i + 1; j < cantidadNumero; j++) {
					if (array[i] == array[j]) {
						repetido++;
						array[j] = -1;
					}
				}
				System.out.println("NUMERO :: " + array[i] + "\nREPETICIONES::  " + repetido);
			}

		}

	}

	private static boolean validarRango(int int1) {

		return (int1 >= 100) && (int1 <= 200);
	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");
	}

}
