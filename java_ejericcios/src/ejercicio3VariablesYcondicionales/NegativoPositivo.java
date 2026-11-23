package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class NegativoPositivo {

	public static void main(String[] args) {
		// Pedir un número e indicar si es positivo o negativo.

		boolean salir = false;
		boolean terminar=false;
		int numero = 0;
		do {
			System.out.println("pon un numero");
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				numero = Integer.parseInt(dato);
				if (positivoNegativo(numero)) {
					System.out.println("numero negativo");

				} else {
					System.out.println("el numero es positivo");
				}
			}else {
				System.out.println("solo numeros");
			}
			terminar=false;
			while (!terminar) {
				System.out.println("quieres terminar s/n");
				String dato2 = Entrada.cadena();
				if (dato2.equalsIgnoreCase("n")) {
					terminar=true;
					salir=false;
				} else if (dato2.equalsIgnoreCase("s")) {
					salir = true;
					terminar=true;
				} else {
					System.out.println("opcion no valida");
				}
			}

		} while (!salir);

	}

	private static boolean positivoNegativo(int numero) {
		return numero < 0;

	}

	private static boolean validacion(String dato) {
		return dato.matches("^-?[0-9]+");

	}

}
