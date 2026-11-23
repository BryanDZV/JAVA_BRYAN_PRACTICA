package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Ecuacion2Grado {

	public static void main(String[] args) {
		/*
		 * Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones
		 * reales. Si no existen, debe indicarlo.
		 */

		boolean salir = false;
		boolean repetir = false;
		int a = 0;
		int b = 0;
		int c = 0;
		int[] coeficientes = new int[3];

		for (int i = 0; i < coeficientes.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("coficiente :" + (i + 1));
				String dato = Entrada.cadena();
				if (validacion(dato)) {
					coeficientes[i] = Integer.parseInt(dato);
					salir = true;
				} else {
					System.out.println("solo numero intentalo denuevo");
				}

			}
		}

		// b² - 4ac
		a = coeficientes[0];
		b = coeficientes[1];
		c = coeficientes[2];
		int discriminante = (int) Math.pow(b, 2) - (4 * a * c);
		// x = (-b ± √(b² - 4ac)) / 2a
		int resultado = (int) ((-b + Math.sqrt(discriminante)) / 2*a);
		if (discriminante < 0) {
			System.out.println("no tiene soluciones reales");

		} else if (discriminante == 0) {
			System.out.println("solucion real doble");
			System.out.println(resultado);
		} else {
			System.out.println("2 soluciones reales");
			int resultadoUno = (int) ((-b + Math.sqrt(discriminante)) / 2);
			int resultadoDos = (int) ((-b - Math.sqrt(discriminante)) / 2);
			System.out.println("SOLUCION 1: "+resultadoUno);
			System.out.println("SOLUCION 2: "+resultadoDos);
		}

	}

	private static boolean validacion(String dato) {
		return dato.matches("^-?[0-9]+");

	}

}
