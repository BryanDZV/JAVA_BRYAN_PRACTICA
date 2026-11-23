package ejericiciosConIterativas;

import utilidades.Entrada;

public class DibujarColumnas {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que permita dibujar columnas con diferentes alturas,
		 * anchuras y separación (espacios en blanco entre ellas). Se utilizará el
		 * carácter ‘*’ para dibujar las columnas. Se solicitará al usuario lo
		 * siguiente: • Número de columnas a dibujar. Debe ser > 0, informando de ello y
		 * solicitando de nuevo el dato en caso de no cumplirse. • Altura de las
		 * columnas. Este valor indicará cuántos ‘*’ contendrá la altura de la columna.
		 * Debe ser > 0, informando de ello y solicitando de nuevo el dato en caso de no
		 * cumplirse. • Anchura de las columnas. Este valor indicará cuántos ‘*’
		 * contendrá la anchura de la columna. Debe ser > 0, informando de ello y
		 * solicitando de nuevo el dato en caso de no cumplirse. • Espacios en blanco
		 * entre columnas. Debe ser > 0, informando de ello y solicitando de nuevo el
		 * dato en caso de no cumplirse.
		 *
		 * LOGICA ENTRADA DE DATOS
		 *
		 */
		boolean salir = false;
		int datoCNumero = 0;
		int datoANumero = 0;
		int datoXNumero = 0;
		int datoENumero = 0;
		System.out.println("iniciando dibujo");
		do {

			System.out.println("introducir numero de columnas mayor a 0");
			String datoC = Entrada.cadena();

			if (!datoC.matches("^-?[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				datoCNumero = Integer.parseInt(datoC);
				if (datoCNumero < 0) {
					System.out.println("el numero debe ser mayor a 0");
				} else {
					salir = true;
				}
			}
		} while (!salir);
		salir = false;
		do {

			System.out.println("introducir numero de ALTURA mayor a 0");
			String datoA = Entrada.cadena();

			if (!datoA.matches("^-?[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				datoANumero = Integer.parseInt(datoA);

				if (datoANumero < 0) {
					System.out.println("el numero debe ser mayor a 0");
				} else {
					salir = true;
				}
			}
		} while (!salir);

		salir = false;
		do {

			System.out.println("introducir numero de ANCHO mayor a 0");
			String datoX = Entrada.cadena();

			if (!datoX.matches("^-?[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				datoXNumero = Integer.parseInt(datoX);

				if (datoXNumero < 0) {
					System.out.println("el numero debe ser mayor a 0");
				} else {
					salir = true;
				}
			}
		} while (!salir);
		salir = false;
		
		
		do {

			System.out.println("introducir numero ESPACIO ENTRE COLUMNAS mayor a 0");
			String datoE = Entrada.cadena();

			if (!datoE.matches("^-?[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				datoENumero = Integer.parseInt(datoE);
				if (datoENumero < 0) {
					System.out.println("el numero debe ser mayor a 0");
				} else {
					salir = true;
				}
			}
		} while (!salir);
		
		
		
		
		
		

		for (int i = 0; i < datoANumero; i++) {
			for (int h = 0; h < datoCNumero; h++) {
				//
				for (int j = 0; j < datoXNumero; j++) {
					System.out.print("*");

				}
				for (int k = 0; k < datoENumero; k++) {

					if (!(h == datoCNumero - 1)) {
						System.out.print("|");
					}
				}

			}

			System.out.println();
		}

	}
}