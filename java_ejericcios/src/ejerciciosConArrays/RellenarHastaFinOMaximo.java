package ejerciciosConArrays;

import utilidades.Entrada;

public class RellenarHastaFinOMaximo {

	public static void main(String[] args) {
		/*
		 * Pide números hasta que escriba "fin" o se hayan introducido 25 números. Luego
		 * muestra los números introducidos.
		 */
		boolean salir = false;
		int[] array = new int[25];
		int indiceNumero = 0;

		do {
			System.out.println("introduce numeros max 25 o FIN PARA SALIR");
			String dato = Entrada.cadena();
			if (dato.equalsIgnoreCase("fin")) {
				System.out.println("saliendo");
				salir = true;
			} else if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				if (indiceNumero < 25) {
					array[indiceNumero] = Integer.parseInt(dato);
					indiceNumero++;
				} else {
					System.out.println("ya has metido 25 numeros");
					salir = true;
				}

			}
		} while (!salir);

		for (int i = 0; i < indiceNumero; i++) {
			System.out.println(array[i]);
		}

	}

}
