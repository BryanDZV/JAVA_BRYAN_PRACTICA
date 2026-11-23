package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class AlReves {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

		System.out.println("pon un numero");
		int dato = Entrada.entero();
		if (rango(dato)) {
			String numero = Integer.toString(dato);

			int resultado = numero.length();
			
			String numeroReves=delReves(numero);
			

			System.out.println(resultado);
			System.out.println("al reves  "+numeroReves);
		}else {
			System.out.println("fuera de rango");
		}
		

	}

	private static String delReves(String dato) {
		String numeroReves="";
		for (int i = dato.length()-1; i>=0; i--) {
			numeroReves+=dato.charAt(i);
		}
		return numeroReves;
	}

	private static boolean rango(int dato) {
		return dato >= 0 && dato <= 9999;

	}

}
