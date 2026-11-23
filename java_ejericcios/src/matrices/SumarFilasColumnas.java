package matrices;

public class SumarFilasColumnas {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		DeclararRellenarMostrar.rellenar(matriz);

		System.out.println("Suma de Fila " + sumarFilas(matriz));
		System.out.println("Suma de Columna " + sumarColumnas(matriz));

	}

	public static int sumarFilas(int[][] matriz) {
		int sumarFila = 0;
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				sumarFila += matriz[i][j];
			}
		}
		return sumarFila;
	}

	public static int sumarColumnas(int[][] matriz) {
		int sumacolumna=0;
		
		for(int i=0;i<matriz[0].length;i++) {
			
		}
		return 0;
	}

}
