package ejericiciosConIterativas;

import utilidades.Entrada;

public class LeerMostrarNumeros {

	public static void main(String[] args) {
		/*
		 * LeerMostrarNumeros Crea un algoritmo que solicite números al usuario hasta
		 * que se introduzca un número mayor que 100. Al salir del bucle se mostrará
		 * “ADIOS.” por la consola.
		 */
		
		boolean salir=false;
		while (!salir) {
			System.out.println("intriduca un numero/mayor a 100 para SALIR");
			int dato=Entrada.entero();
			if (dato>100) {
				salir=true;
			}
		}
		System.out.println("ADIOS");

	}

}
