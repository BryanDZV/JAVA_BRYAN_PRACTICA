package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class MultiploOtro {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo del otro.
		boolean salir = false;
		int cnt = 1;
		boolean primerNumero = true;
		int numero = 0;
		int numeroDos = 0;

		do {
			System.out.println("numero " + cnt);
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				if (primerNumero) {
					numero = Integer.parseInt(dato);
					primerNumero=false;
					cnt++;

				} else {
					numeroDos = Integer.parseInt(dato);
					salir=true;

				}

			}

		} while (!salir);
		
		//multiplos
		if (esMultiplo(numero,numeroDos)) {
			System.out.println("son multiplis");
		}else {
			System.out.println("no son multiplos");
		}
		

	}

	private static boolean esMultiplo(int numero, int numeroDos) {
		return numero%numeroDos==0;
		
	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
