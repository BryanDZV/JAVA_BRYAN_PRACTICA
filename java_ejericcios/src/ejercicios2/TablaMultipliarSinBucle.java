package ejercicios2;

import utilidades.Entrada;

public class TablaMultipliarSinBucle {

	public static void main(String[] args) {
		System.out.println("tabla de multiplicar de: ");
		String dato = Entrada.cadena();
		if (dato.matches("[0-9]")) {
			int datoNumero=combertirNumero(dato);
			int [] tablaMultiplicar=multiplicar(datoNumero);
			for (int i : tablaMultiplicar) {
				System.out.println(i);
			}
		}else {
			System.out.println("no es un numero");
		}
		
		
		
	}

	

	private static int combertirNumero(String dato) {
		int datoNumero=Integer.parseInt(dato);
		return datoNumero;
		
	}



	private static int[] multiplicar(int datoNumero) {
		int [] resultado=new int[11];
		int indiceResultado=0;
		for(int i=0; i<resultado.length;i++) {
			resultado[indiceResultado]=i*datoNumero;
			indiceResultado++;
			
		};
		return resultado;
		
	}

}
