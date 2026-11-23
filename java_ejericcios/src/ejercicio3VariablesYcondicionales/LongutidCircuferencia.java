package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class LongutidCircuferencia {

	public static void main(String[] args) {
		// . Pedir el radio de una circunferencia y calcular su longitud.L=2*PI*r.

		boolean salir = false;
		int radio = 0;
		do {
			System.out.println("radio de circuferencia");
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				radio = Integer.parseInt(dato);
				salir=true;
			} else {
				System.out.println("solo numeros");
			}

		} while (!salir);
		
		//longitud. L=2*PI*r.
		
		double longitud=0;
		longitud=2*Math.PI*(radio);
		
		double longitudR=Math.round(longitud*100.0)/100.0;
		System.out.println("la longitud es "+longitudR);
		System.out.println("la longitud es "+longitud);
		
		
	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
