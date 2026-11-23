package ejerciciosCondicionalesEje2;

import utilidades.Entrada;

public class NumeroDeMes {

	public static void main(String[] args) {
		/*
		 * NumeroMes Crea un algoritmo que pida al usuario un valor comprendido entre 1
		 * y 12 que se corresponde a un mes del año. Se debe mostrar el nombre del mes
		 * que corresponde al número introducido. Si el valor pasado no está en el rango
		 * indicado, se informará que es un mes no válido.
		 */

		boolean salir = false;

		while (!salir) {
			System.out.println("introduce un numero entr 1 y 12 para saber su mes/s para salir");
			String dato = Entrada.cadena();

			if (dato.equalsIgnoreCase("s")) {
				System.out.println("saliendo");
				salir = true;
			} else if (dato.matches("-?[0-9]+")) {
				int esNumero = Integer.parseInt(dato);
				switch (esNumero) {
				case 1:
					System.out.println("Enero");
					break;
				case 2:
					System.out.println("FEBRERO");
					break;
				case 3:
					System.out.println("MARZO");
					break;
				case 4:
					System.out.println("ABRIL");
					break;
				case 5:
					System.out.println("MAYO");
					break;
				case 6:
					System.out.println("JUNIO");
					break;
				case 7:
					System.out.println("JULIO");
					break;
				case 8:
					System.out.println("AGOSTO");
					break;
				case 9:
					System.out.println("SEPTIEMBRE");
					break;

				case 10:
					System.out.println("OCTUBGRE");
					break;
				case 11:
					System.out.println("NOV");
					break;
				case 12:
					System.out.println("DICIEMBRE");
					break;

				default:
					System.out.println("FUERA DE RANGO SOLO ENTRE 1 Y 12 ");
					break;
				}
			}else {
				System.out.println("solo NUMEROS");
			}

		}

	}

}
