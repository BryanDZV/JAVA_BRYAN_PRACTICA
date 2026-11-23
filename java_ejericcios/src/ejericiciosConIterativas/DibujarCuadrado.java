package ejericiciosConIterativas;



import utilidades.Entrada;

public class DibujarCuadrado {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que nos permita dibujar, con ‘*’, un cuadrado. Para ello,
		 * el usuario nos pedirá la longitud del cuadrado (que será el número de ‘*’ que
		 * contendrá dicho lado), y también nos preguntará si queremos que se dibuje el
		 * cuadrado macizo (relleno de ‘*’) o vacío (solo con los laterales). Deberá
		 * comprobarse que la longitud sea mayor que 0 y que la respuesta a la pregunta
		 * de si lo queremos macizo o no, sea SI ó NO.
		 */
		System.out.println("dibujando un cuadrado");
		boolean salir = false;
		boolean relleno = false;
		int datoLado = 0;
		do {
			System.out.println("introduce la longitud");
			String dato = Entrada.cadena();
			if (!(dato.matches("[0-9]+"))) {
				System.out.println("SOLO NUMEROS POSITIVOS");

			} else {
				datoLado = Integer.parseInt(dato);

				do {
					System.out.println("quieres dibujar el cuadrado Macizo S/N");
					String datoRelleno = Entrada.cadena();
					switch (datoRelleno.toLowerCase()) {
					case "s":
						relleno = true;
						salir = true;
						break;
					case "n":
						relleno = false;
						salir = true;
						break;
					default:
						System.out.println("no es una opcion valida");
						break;
					}

				} while (!salir);

			}

		} while (!salir);

		System.out.println(relleno);
		System.out.println(datoLado);

		if (relleno) {
			for (int i = 0; i < datoLado; i++) {
				for (int j = 0; j < datoLado; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			for (int i = 0; i < datoLado; i++) {
				if (i==0 || i==datoLado-1) {
					for (int j = 0; j < datoLado; j++) {
						System.out.print("*");
					}
					System.out.println();
				}else {
					for (int j = 0; j < datoLado; j++) {
						if (j==0 || j==datoLado-1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			
			
			
		}
		
		

	}//main

}
