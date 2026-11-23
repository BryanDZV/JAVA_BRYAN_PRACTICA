package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class PositivoNegaticoHastoCero {

	public static void main(String[] args) {
		// Leer un número e indicar si es positivo o negativo. El proceso se repetirá
		// hasta que se
		// introduzca un 0.
		boolean salir = false;
		do {
			System.out.println("pon un numero");
			int dato = Entrada.entero();
			if (dato == 0) {
				System.out.println("terminado");
				salir = true;
			} else {
				if (positivoNegativo(dato)) {
					System.out.println("es positivo");
				} else {
					System.out.println("es negativo");
				}
			}

		} while (!salir);

	}

	private static boolean positivoNegativo(int dato) {
		
		return dato>=0;
	}

}
