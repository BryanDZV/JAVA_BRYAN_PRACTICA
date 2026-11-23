package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Igualdad {

	public static void main(String[] args) {
		// Pedir dos números y decir si son iguales o no.
		boolean salir = false;
		boolean primerNumero=true;
		int cnt = 1;
		int numero = 0;
		int numeroDos=0;
		do {
			System.out.println("numero " + cnt);
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				if (primerNumero) {
					numero=Integer.parseInt(dato);
					cnt++;
					primerNumero=false;
				}else {
					numeroDos=Integer.parseInt(dato);
					
					if (igualdad(numero, numeroDos)) {
						System.out.println("son iguales");
						salir=true;
					}else {
						System.out.println("no son iguales");
						salir=true;
					}
				}
				
				
			}else {
				System.out.println("solo numeros");
			}

		} while (!salir);

	}

	private static boolean igualdad(int numero, int numeroDos) {
		return numero==numeroDos;
		
	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}

}
