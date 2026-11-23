package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class CantidadDigitos {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		boolean salir = false;
		int digitosTotales = 0;
		do {
			System.out.println("pon un numero");
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				if (rango(Integer.parseInt(dato))) {
					int cnt = 0;
					for (int i = 0; i < dato.length(); i++) {
						char c = dato.charAt(i);
						if (Character.isDigit(c)) {
							cnt++;
						}
					}
					digitosTotales = cnt;
					salir = true;
				} else {
					System.out.println("solo numeros");
				}
			} else {
				System.out.println("fuera de rango");
			}

		} while (!salir);

		System.out.println(digitosTotales);
	}

	private static boolean rango(int int1) {
		return int1 <= 9999;

	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
