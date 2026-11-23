package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Desiciones {

	public static void main(String[] args) {
		//  Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		
		System.out.println("pon una nota");
		int nota=Entrada.entero();
		if (rango(nota)) {
			String resultado=baremo(nota);
			System.out.println(resultado);
			
		}else {
			System.out.println("notas solo del 0 al 10");
		}

	}

	private static String baremo(int nota) {
		String resultado="";
		if (nota>=0 && nota<5) {
			resultado="insuficiente";
		}else if (nota==5) {
			resultado="suficiente";
		}else {
			resultado="bien";
		}
		return resultado;
	}

	private static boolean rango(int nota) {
		return nota>=0 && nota<=10;
		
	}

}
