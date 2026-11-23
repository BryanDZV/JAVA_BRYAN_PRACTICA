package ejerciciosConArrays;

import utilidades.Entrada;

public class ArrayAPartirDeOtro {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que solicite al usuario valores para rellenar un array,
		 * tantos como el usuario decida. Después se creará otro array en el cual se irá
		 * almacenando el resultado de ir sumando parejas de números consecutivos.
		 */
		boolean salir = false;
		int sizeArrayNumeros = 0;
		do {
			System.out.println("cantidad de numeros");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros positivos");
			} else {
				sizeArrayNumeros = Integer.parseInt(dato);
				if (sizeArrayNumeros<2) {
					System.out.println("minimo dos numeros");
				} else {
					salir = true;
				}

			}
		} while (!salir);

		int[] arrayNumeros = new int[sizeArrayNumeros];
		int cnt = 1;
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("numero : " + cnt);
				String n = Entrada.cadena();
				if (!n.matches("[0-9]+")) {
					System.out.println("solo numeros");
				} else {
					arrayNumeros[i] = Integer.parseInt(n);
					salir = true;
					cnt++;
				}
			}

		}

		if (sizeArrayNumeros % 2 != 0) {
			System.out.println("numeros impar el ultimo queda fuera");
		}

		int[] arrayFinal = new int[sizeArrayNumeros / 2];
		int indiceAuxliar=0;
		
		for (int i = 0; i < arrayNumeros.length-1; i+=2) {
			
				arrayFinal[indiceAuxliar]=arrayNumeros[i]+arrayNumeros[i+1];
				indiceAuxliar++;
		
			
		
		}
	
		System.out.println("NUMEROS DEL ARRAY FINAL POR PAREJAS ");
		for (int i : arrayFinal) {
			System.out.println(i);
		}
		

	}// main

}
