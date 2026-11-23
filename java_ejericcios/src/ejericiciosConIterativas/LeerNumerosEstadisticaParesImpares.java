package ejericiciosConIterativas;

import java.util.Random;

public class LeerNumerosEstadisticaParesImpares {

	public static void main(String[] args) {
		/*
		 * LeerNumerosEstadisticaParesImpares Crea un algoritmo que solicite 100 números
		 * al usuario y muestre cuántos de ellos han sido pares y cuántos impares.
		 */

		Random rd = new Random();

		int[] arrayAleatorios = new int[100];
		int indiceAuxiliar = 0;
		for (int i = 0; i < arrayAleatorios.length; i++) {
			int aleatorio = rd.nextInt(0, 101);
			arrayAleatorios[indiceAuxiliar] = aleatorio;
			indiceAuxiliar++;

		}
		
		for (int i = 0; i < arrayAleatorios.length; i++) {
			int elementoArray=arrayAleatorios[i];
			
			if (esParImpar(elementoArray)) {
				System.out.println(elementoArray+" es PAR");
			}else {
				System.out.println(elementoArray+"  es IMPAR");
			}
		}
		

	}

	private static boolean esParImpar(int elementoArray) {
		boolean auxiliarPar=false;
		if (elementoArray%2==0) {
			auxiliarPar=true;
		}
		return auxiliarPar;
	}

}
