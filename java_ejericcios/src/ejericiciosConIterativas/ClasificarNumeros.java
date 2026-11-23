package ejericiciosConIterativas;

import utilidades.Entrada;

public class ClasificarNumeros {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que solicite al usuario que vaya introduciendo números
		 * hasta que introduzca la cadena “fin” o se hayan introducido 10 números. Los
		 * números introducidos tendrán que clasificarse en 3 categorías: • Números
		 * menor que 25. • Números comprendidos entre 25 y 70 (excluyendo el 70). •
		 * Números mayores o iguales que 70. Una vez finalice la introducción de números
		 * se mostrarán los números de cada categoría y el total de números en cada
		 * categoría. Se utilizarán arrays para la realización del ejercicio.
		 *
		 * necsito solicitar numeros asta fin 0 10 elementos necesito 1 array general de
		 * tamaño 10 para gurdar todos los numeros NECSITO 3 CONTADORES DE ELEMENTOS
		 * PARA CADA CATEGORIA necesito 3 array 1 por categoria TAMAÑO IGUAL AL CONTADOR
		 * DE SU CATEOGIRA para mostrar numeros necesito recorrer EL ARRAY GENERAL y
		 * RELLENAR LOS OTROS ARRAY EN FUNCION DE SU RANGO MOSTARR EL LENG DE CADA ARRAY
		 * Y EL LENG TOTAL ENTRE TODO LSO ARRAY
		 *
		 * logica de salida y logica para gurdar een un array todos los numeros logica
		 * para clasificar los numeros gurdados logica para mostrar los numeros ya
		 * clasificados
		 */
		boolean salir = false;
		int numerosIntroducidos = 0;
		int[] general = new int[10];
		do {
			System.out.println("intrduzca 10 numeros o FIN  para salir");
			String dato = Entrada.cadena();

			if (dato.equalsIgnoreCase("fin")) {
				System.out.println("saliendo");
				salir = true;

			} else if (dato.matches("[0-9]+")) {
				int datoNumero = Integer.parseInt(dato);
				general[numerosIntroducidos] = datoNumero;
				numerosIntroducidos++;
				if (numerosIntroducidos == 10) {
					System.out.println("ya se han introducido 10 numeros");
					salir = true;
				}
			} else {
				System.out.println("invalido solo numeros o fin para salir");
			}

		} while (!salir);

		int grupoMenor = 0;
		int grupoMedio = 0;
		int grupoMayor = 0;
		for (int i = 0; i < numerosIntroducidos; i++) {
			if (general[i] < 25) {
				grupoMenor++;
			} else if (general[i] >= 25 && general[i] < 70) {
				grupoMedio++;
			} else {
				grupoMayor++;
			}
		}

		int[] menor = new int[grupoMenor];
		int auxMenor = 0;
		int[] medio = new int[grupoMedio];
		int auxMedio = 0;
		int[] mayor = new int[grupoMayor];
		int auxMayor = 0;
		for (int i = 0; i < numerosIntroducidos; i++) {
			if (general[i] < 25) {
				menor[auxMenor] = general[i];
				auxMenor++;
			} else if (general[i] >= 25 && general[i] < 70) {
				medio[auxMedio] = general[i];
				auxMedio++;
			} else {
				mayor[auxMayor] = general[i];
				auxMayor++;
			}
		}
		
		System.out.println("mostrando datos Mayor");
		for (int i : mayor) {
			System.out.println(i);
		}
		System.out.println("\n");
		System.out.println("mostrando datos Medio");
		for (int i : medio) {
			System.out.println(i);
		}
		System.out.println("\n");
		System.out.println("mostrando datos Menor");
		for (int i : menor) {
			System.out.println(i);
		}
		
		
		

	}// main
}