package ejerciciosCondicionalesEje2;

import utilidades.Entrada;

public class AnioBisiesto {

	public static void main(String[] args) {
		/*
		 * AnioBisiesto Crea un algoritmo que nos diga si un año es bisiesto. El usuario
		 * introducirá un año por teclado y se le mostrará por pantalla si lo es o no.
		 *
		 * 
		 * BISIESTO SI: DIVISIBLE ENTRE 4 Y !10 O DIVISIBLE ENTRE 400
		 * 
		 */
		
		boolean salir = false;
		while (!salir) {
			System.out.println("intriduce una fecha para saber si es bisiesto/S PARA SALIR");
			String dato = Entrada.cadena();
			boolean datoNumero = dato.matches("^-?[0-9]+$");
			if (datoNumero) {
				int esNumero = Integer.parseInt(dato);
				if ((esNumero % 4 == 0 && esNumero % 100 != 0) || (esNumero % 400 == 0)) {
					System.out.println("es bisiesto:  " + esNumero);
				}else {
					System.out.println("no es bisiesto: "+esNumero);
				}

			}else if (dato.equalsIgnoreCase("s")) {
				System.out.println("saliendo ");
				salir=true;
			} else {
				System.out.println("solo numero");
			}

		}

	}
}
