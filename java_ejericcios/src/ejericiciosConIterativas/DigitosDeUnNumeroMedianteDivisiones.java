package ejericiciosConIterativas;

import utilidades.Entrada;

public class DigitosDeUnNumeroMedianteDivisiones {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que nos diga cuántos dígitos tiene un número. El usuario
		 * proporcionará el número a calcular. Este ejercicio debe resolverse mediante
		 * divisiones sucesivas por 10 hasta que se alcance el cociente 0.
		 * 
		 * resitricions de metodo no con decimales tratlo como string y no cuetes el
		 * punto o coma y podrias resolver no con negativos usa math.abs y podrias
		 * resolver
		 * 
		 * METODO SOLO APRA ENTEROS va quitando cifras al divir el nuemro hasta llegar a
		 * 0
		 */

		boolean salir = false;
		int digitos = 0;

		do {
			System.out.println("numero de digitos del numero:");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros");

			} else {
				if (Integer.parseInt(dato) == 0) {
					System.out.println("Numeros de digitos:\n" + 1);
					salir = true;
				} else {
					int datoNumero = Integer.parseInt(dato);
					while (datoNumero != 0) {
						datoNumero = datoNumero / 10;
						digitos++;

					}
					System.out.println("numero de digitos:\n " + digitos);
					salir=true;
				}
			}

		} while (!salir);

	}

}
