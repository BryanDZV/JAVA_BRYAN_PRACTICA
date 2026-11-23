package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class CuadradoHastaNegativo {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
		// introduzca un
		// número negativo.

		boolean salir = false;
		int numero = 0;

		do {
			System.out.println("pon un numero o numero Negativo para terminar");
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				numero = Integer.parseInt(dato);
				if (numero < 0) {
					System.out.println("terminando");
					salir = true;
				} else {
					int resultado = calcularCuadrado(numero);
					System.out.println("cuadrado de " + numero + " es " + resultado);
				}

			} else {
				System.out.println("solo numeros");
			}

		} while (!salir);

	}

	private static int calcularCuadrado(int numero) {
		return (int) Math.pow(numero, 2);
	}

	private static boolean validacion(String dato) {

		return dato.matches("^-?[0-9]+");
	}

}
