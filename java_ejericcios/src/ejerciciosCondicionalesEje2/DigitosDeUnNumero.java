package ejerciciosCondicionalesEje2;

import utilidades.Entrada;

public class DigitosDeUnNumero {

	public static void main(String[] args) {
		/*
		 * DigitosDeUnNumero Escribe un algoritmo que nos permita calcular cuántos
		 * dígitos forman un número. El usuario deberá introducir un número comprendido
		 * entre -10000 y 10000, informando que el número es erróneo en caso de que no
		 * sea así. Para resolver este ejercicio se podrán ir haciendo comprobaciones de
		 * valor, es decir, si está entre (-10, 10), tiene 1 cifra, si no, si está entre
		 * (-100, 100), tiene 2 cifras, etc.
		 */

		boolean salir = false;
		while (!salir) {
			System.out.println("intrduce un numero apra saber sus cifras/s para SALIR2");
			String dato = Entrada.cadena();
			if (dato.equalsIgnoreCase("s")) {
				System.out.println("saliendo ");
				salir = true;
			} else if (dato.matches("-?[0-9]+")) {
				int esNumero = Integer.parseInt(dato);
				if (esNumero > -10 && esNumero < 10) {
					System.out.println(esNumero + " tiene 1 cifras");
				} else if (esNumero > -100 && esNumero < 100) {
					System.out.println(esNumero + " tiene 2 cifras");

				} else if (esNumero > -1000 && esNumero < 1000) {
					System.out.println(esNumero + " tiene 3 cifras");

				} else if (esNumero > -10000 && esNumero < 10000) {
					System.out.println(esNumero + " tiene 4 cifras");

				}else {
					System.out.println("fuerA DE RANGO");
					
				}
			} else {
				System.out.println("solo numeros");
			}

		}

	}

}
