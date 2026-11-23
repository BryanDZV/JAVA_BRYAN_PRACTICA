package ejerciciosConArrays;

import utilidades.Entrada;

public class BuscarUnNumero {

	public static void main(String[] args) {
		/*
		 * Pide 10 números y luego pregunta por uno. Di si está en el array o no.
		 * Objetivo: Recorrer buscando un valor con bandera.
		 */

		int[] numeros = new int[4];
		int cnt = 1;
		boolean salir = false;

		for (int i = 0; i < numeros.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("numero :: " + cnt);
				String dato = Entrada.cadena();
				if (!validacion(dato)) {
					System.out.println("solo numeros");
				} else {
					numeros[i] = Integer.parseInt(dato);
					cnt++;
					salir = true;

				}

			}
		}
		salir = false;
		int numeroABuscar = 0;
		do {
			System.out.println("numero a buscar");
			String datoBuscar = Entrada.cadena();
			if (!validacion(datoBuscar)) {
				System.out.println("solo numeros");
			} else {
				numeroABuscar = Integer.parseInt(datoBuscar);
				salir = true;

			}

		} while (!salir);
		boolean existe = false;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroABuscar) {
				existe = true;
			}
		}

		if (existe) {
			System.out.println("existe el numero");
		} else {
			System.out.println("no EXISTE EL NUMERO");
		}

	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
