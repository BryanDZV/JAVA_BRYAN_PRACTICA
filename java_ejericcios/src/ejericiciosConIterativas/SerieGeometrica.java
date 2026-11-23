package ejericiciosConIterativas;

import utilidades.Entrada;

public class SerieGeometrica {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que nos muestre una serie geométrica que definirá el
		 * usuario. Nos pasará el primer y el último valor de la serie, y la razón.
		 * Deberá comprobarse que los parámetros pasados son válidos, informando en caso
		 * contrario que la serie está mal definida. es multiplicando por la razon que
		 * den
		 */
		System.out.println("introduzca el primer valor");
		int datoP = Entrada.entero();
		System.out.println("introduzca el ultimo valor");
		int datoU = Entrada.entero();
		System.out.println("introduzca la razon valor");
		int datoR = Entrada.entero();

		if (serieValida(datoP, datoU, datoR)) {
			System.out.println("Serie generada:");
			System.out.println(datoP); // Mostrar el primer valor
			while ((datoP * datoR) <= datoU) {
				datoP = datoP * datoR;
				System.out.println(datoP);
			}
		} else {
			System.out.println("serie invalida");
		}

	}



		private static boolean serieValida(int datoP, int datoU, int datoR) {
			/*
			 * numero entre primero y ultimo si es mayor que el ultimo se para primer numero
			 * > que el ultimo !=serie no valida
			 */
			
			// Razon debe ser > 1 para avanzar y que no se repita o bloquee
			if (datoP <= 0 || datoU <= 0 || datoR <= 1) {
				System.out.println("Serie no válida: la razón debe ser > 1 y los valores > 0");
				return false;
			}

			// Si el primer número ya es mayor que el último, no tiene sentido avanzar
			if (datoP > datoU) {
				System.out.println("Serie no válida: el primer número ya es mayor que el último");
				return false;
			}

			return true;
		}
	}