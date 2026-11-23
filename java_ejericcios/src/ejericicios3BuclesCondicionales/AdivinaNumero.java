package ejericicios3BuclesCondicionales;

import utilidades.Entrada;



		public class AdivinaNumero {

		    public static void main(String[] args) {
		    	/*
				 * Realizar un juego para adivinar un número. Para ello pedir un número N, y
				 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
				 * con respecto a N. El proceso termina cuando el usuario acierta.
				 */
		    
		        System.out.println("Jugador 1: pon el número a adivinar");
		        int numeroAdivinar = Entrada.entero();

		        boolean salir = false;
		        do {
		            System.out.println("Jugador 2: intenta adivinar");
		            int dato = Entrada.entero();

		            int diff = dato - numeroAdivinar;

		            if (dato == numeroAdivinar) {
		                System.out.println("¡Has acertado!");
		                salir = true;
		            } else if (diff < 0 && Math.abs(diff) <= 2) {
		                System.out.println("Es menor y muy cerca, vuelve a intentar");
		            } else if (diff < 0) {
		                System.out.println("Es menor, vuelve a intentar");
		            } else if (diff > 0 && Math.abs(diff) <= 2) {
		                System.out.println("Es mayor y muy cerca, vuelve a intentar");
		            } else {
		                System.out.println("Es mayor, vuelve a intentar");
		            }

		        } while (!salir);
		    }
		}
