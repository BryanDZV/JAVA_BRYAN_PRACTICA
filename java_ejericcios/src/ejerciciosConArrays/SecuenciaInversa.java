package ejerciciosConArrays;

import utilidades.Entrada;

public class SecuenciaInversa {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que pase valores a un array para después mostrarlos por
		 * pantalla en el orden inverso en el que se introdujeron. El tamaño del array
		 * lo pasará el usuario.
		 */
		boolean salir = false;
		int size = 0;
		do {
			System.out.println("introduce tamaño de array");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numero positivos");
			} else {
				size = Integer.parseInt(dato);
				salir = true;
			}

		} while (!salir);

		int[] arrayNumeros = new int[size];
		salir = false;
		int n = 0;
		int numeroIntroducido=size;

		int indiceArray = 0;
		do {
			System.out.println("introduce  " + numeroIntroducido + "  numeros para introducir en el array ");
			String datoNumero = Entrada.cadena();
			if (!datoNumero.matches("[0-9]+")) {
				System.out.println("solo numero positivos");
			} else {
				n = Integer.parseInt(datoNumero);

				arrayNumeros[indiceArray] = n;
				if (indiceArray == arrayNumeros.length - 1) {
					System.out.println("ya has introducido todos los numeros");
					salir = true;
				} else {
					indiceArray++;
					numeroIntroducido--;
				}
			}

		} while (!salir);
		
		System.out.println(" MOSTRANDO ARRAY INVERSO");

		for(int i=arrayNumeros.length-1 ;i>=0;i--) {
			System.out.println("numero "+" "+arrayNumeros[i]);
		}
		
		
		System.out.println("CON WHILE");
		int i=arrayNumeros.length-1;
		while (i>=0) {
			System.out.println(arrayNumeros[i]);
			i--;
		}
		

	}

}
