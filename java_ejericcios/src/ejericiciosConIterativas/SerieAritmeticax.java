package ejericiciosConIterativas;

import utilidades.Entrada;

public class SerieAritmeticax {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que nos muestre una serie aritmética que definirá el
		 * usuario. Nos pasará el primer y el último valor de la serie, y el valor a
		 * incrementar o decrementar. Deberá comprobarse que los parámetros pasados son
		 * válidos, informando en caso contrario que la serie está mal definida. Un
		 * ejemplo de serie mal definida: primero nº:4, último nº:30, incremento: -3.
		 */

		System.out.println("tu serie");
		System.out.println("primer valor");
		int datoP = Entrada.entero();
		System.out.println("ultimo valor");
		int datoU = Entrada.entero();
		System.out.println("incremento");
		int datoI = Entrada.entero();

		if (serieValida(datoP, datoU, datoI)) {
			System.out.println("Serie generada:");
			System.out.println(datoP); // Mostrar primer valor

			while ((datoI > 0 && datoP + datoI <= datoU) || (datoI < 0 && datoP + datoI >= datoU)) {
				datoP += datoI;
				System.out.println(datoP);
			}
		}
	}

	private static boolean serieValida(int datoP, int datoU, int datoI) {
		boolean p = (datoP > datoU) && (datoI < 0); // decremento
		boolean u = (datoP < datoU) && (datoI > 0); // incremento

		if (p) {
			System.out.println("serie Correcta Decremento");
			return true;
		} else if (u) {
			System.out.println("serie Correcta Incremento");
			return true;
		} else {
			System.out.println("serie ERRONEA");
			return false;
		}
	}
}
