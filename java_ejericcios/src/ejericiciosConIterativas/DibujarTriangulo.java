package ejericiciosConIterativas;

import utilidades.Entrada;

public class DibujarTriangulo {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que nos permita dibujar, con ‘*’, un triángulo. Para ello,
		 * el usuario nos pedirá el número de filas que queremos que tenga el triángulo
		 * y si queremos que se dibuje el triángulo macizo (relleno de ‘*’) o vacío
		 * (solo con los laterales). Deberá comprobarse que el número de filas pasado
		 * sea mayor que 0 y que la respuesta a la pregunta de si lo queremos macizo o
		 * no, sea SI ó NO.
		 */
		boolean salir = false;
		boolean relleno = false;
		int filas = 0;
		do {
			System.out.println("Introduce el número de filas del triángulo (mayor que 0): ");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+") || Integer.parseInt(dato) <= 0) {
				System.out.println("solo numeros mayores a 0");

			} else {
				filas = Integer.parseInt(dato);
				
				do {
					System.out.println("quieres relleno el triangulo S/N");
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
						System.out.println("opcion no valida");
						break;
					}

				} while (!salir);

			}
		} while (!salir);

		if (relleno) {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < filas-i; j++) {
					System.out.print(" ");

				}
				for (int k = 0; k < 2*i+1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < filas-i; j++) {
					System.out.print(" ");

				}
				
				for (int k = 0; k < 2*i+1; k++) {
					
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

		/*
		 * int altura = 5; // Cambia este valor para ajustar la altura del triángulo
		 * 
		 * for (int i = 1; i <= altura; i++) { // Imprimir espacios 
		 * for (int j = 1; j <=altura - i; j++) { System.out.print(" "); } // Imprimir asteriscos 
		 * for (int k = 1; k <= 2 * i - 1; k++) { System.out.print("*"); } System.out.println(); //
		 * Salto de línea al final de cada fila }
		 */
	}// main

}
