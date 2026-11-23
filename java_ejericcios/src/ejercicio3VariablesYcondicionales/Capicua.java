package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Capicua {

	public static void main(String[] args) {
		//Pedir un número entre 0 y 9.999, decir si es capicúa.
		System.out.println("pon un numero");
		int dato=Entrada.entero();
		String suReves="";
		if (rango(dato)) {
			suReves=alReves(dato);
			if (esCapicua(dato,suReves)) {
				System.out.println("es CAPICUA");
			}else {
				System.out.println("no es capicua");
			}
			
			
		}else {
			System.out.println("fuera de rango");
		}
		
	}

	private static boolean esCapicua(int dato, String suReves) {
		int x=Integer.parseInt(suReves);
		return dato==x;
	}

	private static String alReves(int dato) {
		String x="";
		String n=Integer.toString(dato);
		for (int i = n.length()-1; i>=0; i--) {
			x+=n.charAt(i);
		}
		return x;
	}

	private static boolean rango(int dato) {
		return dato>=0 && dato<=9999;
		
	}

}
