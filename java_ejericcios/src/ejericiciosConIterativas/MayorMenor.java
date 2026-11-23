package ejericiciosConIterativas;

import java.util.Random;

import utilidades.Entrada;

public class MayorMenor {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que, dada una secuencia de números pasada por el usuario,
		 * nos muestre cuál es el mayor y cuál el menor. Cuántos números se van a
		 * introducir se solicitará al usuario al principio del programa.
		 * 
		 * necesito una variable para mayor necesito una variable para menor necsito un
		 * array de tamaño=solicitado solventar el porblema de inciar la variable en 0
		 * SOLUCION DALES EL PRIMER VALOR DEL ARRAY!=de 0 ya se adentro o fura de bucle
		 */

		System.out.println("introducir numero de elementos ne el array");
		int dato = Entrada.entero();
		int[] array = new int[dato];
		Random rd = new Random();
		int max = 0;
		int min = 0;

		for (int i = 0; i < array.length; i++) {
			int aleatorio = rd.nextInt(1, 71);
			array[i] = aleatorio;
			System.out.println(array[i]);

			if (i == 0) {
				max = array[0];// aqui le cambio por el primero valor del array
				min = array[0];
			} else {

				if (array[i] > max) {
					max = array[i];
				}

				if (array[i] < min) {
					min = array[i];
				}
			}
		}

		System.out.println("maximo:  " + max);
		System.out.println("minimo:  " + min);

	}

}
