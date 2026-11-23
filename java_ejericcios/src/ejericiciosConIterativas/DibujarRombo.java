package ejericiciosConIterativas;

import utilidades.Entrada;

public class DibujarRombo {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que permita dibujar, con ‘*’, un rombo. Para ello, el
		 * usuario nos pedirá el número de filas que queremos que tenga la parte
		 * superior del rombo (será similar a un triángulo) y si queremos que se dibuje
		 * el rombo macizo (relleno de ‘*’) o vacío (solo con los laterales). Deberá
		 * comprobarse que el número de filas pasado sea mayor que 0 y que la respuesta
		 * a la pregunta de si lo queremos macizo o no, sea SI ó NO. Consideraremos un
		 * rombo como 2 triángulos que comparten su base (uno de ellos con el vértice
		 * hacia arriba y el otro con el vértice hacia abajo).
		 */

		boolean salir = false;
		int filas = 0;
		boolean relleno = false;
		do {
			System.out.println("numero de filas de la parte superior del rombo");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros");

			} else {
				filas = Integer.parseInt(dato);
				do {
					System.out.println("Quieres que el rombo sea Relleno S/N");
					String datoRelleno = Entrada.cadena();
					switch (datoRelleno.toLowerCase()) {
					case "s":
						relleno = true;
						salir = true;
						break;
					case "n":
						relleno = false;
						salir = true;
						break;

					default:
						System.out.println("OPCION NO VALIDA");
						break;
					}
				} while (!salir);
			}
		} while (!salir);

		if (relleno) {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < filas - i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (2 * i) + 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = filas; i > 0; i--) {
				for (int j = 0; j < filas - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (2 * i) - 1; k++) {
					System.out.print("*");
				}

				System.out.println();
			}
		} else {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < filas - i - 1; j++) {
					System.out.print(" ");
				}

				for (int k = 0; k < (2 * i) + 1; k++) {
					if (k==0) {
						System.out.print("*");
					}else {
						
						if (k > 0 && k < 2 * i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}

				}
				System.out.println();
			}

			// Parte inferior
			for (int i = filas-2 ; i >=0; i--) {
			    for (int j = 0; j < filas - i - 1; j++) {
			        System.out.print(" ");
			    }
			    for (int k = 0; k < (2 * i) + 1; k++) {
			    	if (i==filas-1) {
						System.out.print("*");
					}else {
						
						if (k > 0 && k < 2 * i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
			    }
			    System.out.println();
			}
		}

	}// MAIN

}
