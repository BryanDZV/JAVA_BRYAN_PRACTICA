package ejericicios3BuclesCondicionales;

import utilidades.Entrada;

public class MediaArimetica {

	public static void main(String[] args) {
		/* Pedir números hasta que se introduzca uno negativo, y calcular la media */
		
		boolean salir=false;
		boolean primerNumero=true;
		int sumaNumeros=0;
		int totalNumeros=0;
		double mediaArimetica=0;
		
		do {
			System.out.println("pon un numero");
			int dato=Entrada.entero();
			if (dato<0) {
				System.out.println("terminando ");
				salir=true;
			}else {
				if (primerNumero) {
					sumaNumeros=dato;
					primerNumero=false;
				}else {
					sumaNumeros+=dato;
				}
				totalNumeros++;
			}
		} while (!salir);

		//media 
		if (totalNumeros==0) {
			System.out.println("no hay media con 0 numeros");
		}else {
			mediaArimetica = (double)sumaNumeros / totalNumeros;

		System.out.println("la media es "+ mediaArimetica);
		System.out.println(totalNumeros);
		}
		
		
		
	}

}
