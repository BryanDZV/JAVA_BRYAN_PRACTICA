package matrices;

import java.util.Iterator;
import java.util.Random;

public class DeclararRellenarMostrar {
	public static void main(String[] args) {

		/*
		 * Ejercicio 1: Mostrar matriz Objetivo: Declarar, rellenar y mostrar una matriz
		 * de 3x3
		 */

		int[][] matriz = new int[4][4];
		
		matriz=rellenar(matriz);
		
		
		

		
	}//mian

	public static int[][] rellenar(int[][] matriz) {
		Random rd = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int aleatorio = rd.nextInt(0, 100);
				//System.out.print("antes----"+matriz[i][j]+"\t");
				
				matriz[i][j] = aleatorio;
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		return matriz;
	}
}//class
