package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class CualEsMayor {

	public static void main(String[] args) {
		// Pedir dos números y decir cual es el mayor.

		int[] numeros = new int[2];
		boolean salir = false;
		int cnt = 1;
		for (int i = 0; i < numeros.length; i++) {
			salir=false;
			while (!salir) {
				System.out.println("numero " + (i + 1));
				String dato = Entrada.cadena();
				if (validacion(dato)) {
					numeros[i] = Integer.parseInt(dato);
					salir = true;
				} else {
					System.out.println("solo numeros");
				}

			}

		}
		
		if (numeros[0]<numeros[1]) {
			System.out.println("numero "+ numeros[0]+ " mayor a " +numeros[1]);
		}
		
		for (int i = 0; i < numeros.length-1; i++) {
			if (numeros[i]<numeros[i+1]) {
				System.out.println("NUMERO "+ numeros[i]+" MAYOR A "+ numeros[i+1]);
			}
		}
		

	}//main

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
