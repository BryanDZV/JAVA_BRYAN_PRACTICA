package ejerciciosConArrays;

import utilidades.Entrada;

public class InvertirArray {

	public static void main(String[] args) {
		/*
		 * Pide al usuario cuántos valores quiere introducir y luego muéstralos en orden
		 * inverso.
		 */

		boolean salir = false;
		int cantidad = 0;
		do {
			System.out.println("cantidad de numeros");
			String dato = Entrada.cadena();

			if (validacionEsNumero(dato)) {
				cantidad = Integer.parseInt(dato);
				salir = true;
			} else {
				System.out.println("solo numeros");
			}

		} while (!salir);

		int[] arrayNumeros = new int[cantidad];
		int cnt = 1;
		for (int i = 0; i < arrayNumeros.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("numero:: " + cnt);
				String datoGuardar = Entrada.cadena();

				if (validacionEsNumero(datoGuardar)) {
					arrayNumeros[i] = Integer.parseInt(datoGuardar);
					cnt++;
					salir = true;
				} else {
					System.out.println("solo numeros");
				}
			}

		}
		System.out.println("numeros en inverso");
		for(int i=arrayNumeros.length-1;i>=0;i--) {
			System.out.print(arrayNumeros[i]+"\t");
		}

	} // main

	private static boolean validacionEsNumero(String dato) {
		
		return dato.matches("[0-9]+");

	}

}
