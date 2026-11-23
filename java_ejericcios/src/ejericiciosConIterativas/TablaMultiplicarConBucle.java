package ejericiciosConIterativas;

import utilidades.Entrada;

public class TablaMultiplicarConBucle {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que muestre tablas de multiplicar. El usuario pasará por
		 * teclado el número del que quiere mostrar la tabla; al terminar se preguntará
		 * si se quiere generar otra tabla, si la respuesta es distinta de “S” terminará
		 * la ejecución
		 */
		boolean salir = false;
		
		do {
			System.out.println("numero para mostrar su tabla ");
			String dato = Entrada.cadena();

			if (!dato.matches("[0-9]+")) {
				System.out.println("solo numeros");
			} else {
				int cnt = 1;
				while (cnt <= 10) {
					int datoNumero = Integer.parseInt(dato);

					int resultado = datoNumero * cnt;

					System.out.println(datoNumero + "*" + cnt + "=" + resultado);
					cnt++;
				}
				System.out.println("si quieres otra tabla pulsa s");
				String dato2 = Entrada.cadena();
				if (!dato2.equalsIgnoreCase("s")) {
					System.out.println("saliendo");
					salir = true;
				}
			}

		} while (!salir);

	}

}
