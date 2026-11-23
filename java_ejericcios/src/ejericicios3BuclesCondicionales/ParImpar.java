package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class ParImpar {

	public static void main(String[] args) {
		// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		boolean salir=false;
		do {
			System.out.println("pon un numero");
			int dato=Entrada.entero();
			if (dato==0) {
				System.out.println("terminado");
				salir=true;
			}else {
				if (parImpar(dato)) {
					System.out.println("es par");
				}else {
					System.out.println("es impar");
				}
			}
			
		} while (!salir);

	}

	private static boolean parImpar(int dato) {
		
		return dato%2==0;
	}

}
