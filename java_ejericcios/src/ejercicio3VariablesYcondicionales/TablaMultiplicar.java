package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class TablaMultiplicar {

	public static void main(String[] args) {
		/*
		 * 16. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
		 * multiplicar de dicho número.
		 */

		boolean salir = false;
		int numeroGuardado = 0;

		do {
			System.out.println("pon un unmer entre 0 y 10");
			int dato = Entrada.entero();
			if (rango(dato)) {
				numeroGuardado = dato;
				salir = true;
			} else {
				System.out.println("solo numero entre 0 y 10");
			}

		} while (!salir);

		// tabla

		if (numeroGuardado == 0) {
			System.out.println(" no hay tabla cualquier numero * 0 es 0");
		} else {
			for (int i = 1; i <= 10; i++) {

				int tabla = numeroGuardado * i;
				System.out.println(tabla);
			}
		}

	}

	private static boolean rango(int dato) {
		// TODO Auto-generated method stub
		return dato >= 0 && dato <= 10;
	}

}
