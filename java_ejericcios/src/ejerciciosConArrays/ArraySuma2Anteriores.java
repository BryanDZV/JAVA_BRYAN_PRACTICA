package ejerciciosConArrays;

import java.util.Iterator;

public class ArraySuma2Anteriores {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que rellene un array de 30 números. Los dos primeros
		 * valores del array se inicializarán a 0 y a 3 respectivamente, y el resto
		 * serán la suma de los dos anteriores. Mostraremos el array en orden ascendente
		 * y orden descendente. Ejemplo: 0 3 3 6 9 15 …
		 */

		int[] array = new int[30];

		array[0] = 0;
		array[1] = 3;
		int cnt=0;
		for(int i=2; i<30;i++) {
			array[i]=array[i-1]+array[i-2];
			System.out.println("****************");
			System.out.println("cnt numeros realmente iintroducidos\n"+cnt+"\nel NUMERO "+array[i]);
			System.out.println("****************");
			System.out.println("recorrido de  i "+i);
			cnt++;
		}
		
		System.out.println("ORDEN INVERSO");
		for (int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}

	}

}
