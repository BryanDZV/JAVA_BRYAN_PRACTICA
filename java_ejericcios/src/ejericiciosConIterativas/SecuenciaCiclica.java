package ejericiciosConIterativas;

import utilidades.Entrada;

public class SecuenciaCiclica {

	public static void main(String[] args) {
		/*
		 * SecuenciaCiclica Crea un algoritmo que nos muestre una secuencia cíclica de
		 * las palabras Perro Gato Lobo hasta alcanzar el número de palabras que elija
		 * el usuario. Ejemplo: si se solicitan 7 palabras la serie será: Perro, Gato,
		 * Lobo, Perro, Gato, Lobo, Perro.
		 */

		String[] palabras = { "perro", "gato", "lobo" };
		System.out.println("introduce numero de palabras que quieres");
		int secuencia = Entrada.entero();
		for(int i=0;i<secuencia;i++) {
			System.out.println(palabras[i%palabras.length]);
		}

	}

}
