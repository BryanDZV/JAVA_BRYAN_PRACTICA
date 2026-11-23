package ejerciciosConArrays;

import utilidades.Entrada;

public class ArraySuma2AnterioresVersion2 {

	public static void main(String[] args) {
		/*
		 * Crea un array de 5 posiciones. Los 2 primeros son 0 y 3. El resto es la suma
		 * de los 2 anteriores.
		 * 
		 * pido datos y guardo en arrayAuxiliar con el size= a la cantidad dicha por el
		 * usuario en arrayFinal la [0]=0 y [1]=3 y el size= la mitad del arrayAuxiliar
		 * por ser sumade parejas si es impar el ultimo numero sin pareja preguntamos al
		 * usuarios si mostramos o no
		 */

		boolean salir = false;
		int cantidadNumeros = 0;
		boolean mostrarUltimoNumero = false;

		do {
			System.out.println("creando array con pareja de numeros");
			System.out.println("cuantos numeros quieres");
			String dato = Entrada.cadena();
			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				cantidadNumeros = Integer.parseInt(dato);
				if (!(cantidadNumeros % 2 == 0)) {
					System.out.println("ultimo numero no tiene pareja quieres mostrarlo S/N");
					String datoMostrar = Entrada.cadena();
					if (mostrarNumero(datoMostrar)) {
						System.out.println("se mostrano el Numero");
						mostrarUltimoNumero = true;
						salir = true;
					} else {
						System.out.println("no se mostrara el ultimo numero");
						mostrarUltimoNumero = false;
						salir = true;
					}
				}else {
					salir=true;
				}

			}

		} while (!salir);

		int[] arrayTemporal = new int[cantidadNumeros];

		for (int i = 0; i < arrayTemporal.length; i++) {
			salir = false;
			while (!salir) {
				System.out.println("numero a introducir:");
				String datoIntroducir = Entrada.cadena();
				if (!validacionNumero(datoIntroducir)) {
					System.out.println("solo NUMEROS vuelve a INTRODUCIR");
				} else {
					arrayTemporal[i] = Integer.parseInt(datoIntroducir);
					salir = true;
				}

			}

		}

		if (mostrarUltimoNumero) {
			System.out.println("CON ULTMO NUMERO");
			int[] arrayFinal = new int[(cantidadNumeros / 2) + 1];
			int indiceAuxiliar = 0;
			arrayFinal[arrayFinal.length - 1] = arrayTemporal[arrayTemporal.length - 1];
			for (int i = 0; i < arrayTemporal.length-1; i += 2) {
				arrayFinal[indiceAuxiliar] = arrayTemporal[i] + arrayTemporal[i + 1];
				indiceAuxiliar++;

			}
			for (int i : arrayFinal) {
				System.out.println(i);
			}
		} else {
			System.out.println("SIN ULTIMO  NUMERO");
			int[] arrayFinal = new int[(cantidadNumeros / 2)];
			int indiceAuxiliar = 0;
			for (int i = 0; i < arrayTemporal.length-1; i += 2) {
				arrayFinal[indiceAuxiliar] = arrayTemporal[i] + arrayTemporal[i + 1];
				indiceAuxiliar++;

			}

			for (int i : arrayFinal) {
				System.out.println(i);
			}
		}

	}

	private static boolean validacionNumero(String datoIntroducir) {
		return datoIntroducir.matches("[0-9]+");

	}

	private static boolean mostrarNumero(String datoMostrar) {
		return datoMostrar.equalsIgnoreCase("s");

	}

}
