package matrices;

public class SumarElementos {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		DeclararRellenarMostrar.rellenar(matriz);
		System.out.println("tamaño  " + matriz.length);

		sumarElementos(matriz);
		System.out.println("total suma elementos "+sumarElementos(matriz));
		
		
		
	}// main

	public static int sumarElementos(int[][] matriz) {
		int sumar = 0;
		int sumaPorFila = 0;
		for (int i = 0; i < matriz.length; i++) {
			sumaPorFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumar += matriz[i][j];
				sumaPorFila += matriz[i][j];

			}
			// System.out.println("suma total cada fila "+sumaPorFila);
		}
		//System.out.println("total suma elementos---" + sumar);

		return sumar;
	}

}// clas
