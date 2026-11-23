package ejerciciosConArrays;

import utilidades.Entrada;

public class MediaAritmetica {

	public static void main(String[] args) {
		/*
		 * Pide números hasta que escriba "fin" o se hayan introducido 25 números. Luego
		 * muestra los números introducidos y Calcula la media de los números
		 * introducidos.
		 */

		boolean salir = false;
		int[] arrayAuxiliar = new int[5];
		int numeroIntroducido = 0;
		do {
			if (numeroIntroducido < arrayAuxiliar.length) {
				System.out.println("mostrando y calulando la media arimetica");
				System.out.println("introduce 5 numero o fin para terminar antes ");
				String dato = Entrada.cadena();
				if (dato.equalsIgnoreCase("fin")) {
					System.out.println("saliendo");
					salir = true;

				} else if (!dato.matches("[0-9]+")) {
					System.out.println("solo numeros");
				} else {
					int datoParseado = Integer.parseInt(dato);

					System.out.println("numero:: " + datoParseado);
					arrayAuxiliar[numeroIntroducido] = datoParseado;
					numeroIntroducido++;

					System.out.println("indice = a :" + numeroIntroducido);

				}

			} else {
				System.out.println("numeros introducidos completos");
				salir = true;
			}

		} while (!salir);

		for (int i = 0; i < numeroIntroducido; i++) {
			System.out.print(arrayAuxiliar[i]+"\t");
		}

		int sumaTotal = 0;
		int mediaArimetica = 0;
		for (int i = 0; i < numeroIntroducido; i++) {
			sumaTotal += arrayAuxiliar[i];

		}
		System.out.println();
		System.out.println("MEDIA ARIMETICA");
		if (numeroIntroducido == 0) {
			System.out.println("sin numeros introducidos");
		} else {
			mediaArimetica = sumaTotal / (numeroIntroducido);
		}

		System.out.println("media arimetica ::\n" + mediaArimetica);
	}

}
