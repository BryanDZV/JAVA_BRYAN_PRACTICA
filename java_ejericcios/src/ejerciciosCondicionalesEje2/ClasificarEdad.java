package ejerciciosCondicionalesEje2;

import utilidades.Entrada;

public class ClasificarEdad {

	public static void main(String[] args) {
		/*
		 * ClasificarEdad Escribe un algoritmo que solicite al usuario que introduzca
		 * una edad. Se comprobará dicha edad pasada teniendo en cuenta los siguientes
		 * casos: • Si es menor de 14 años, se mostrará un mensaje diciendo que la “Edad
		 * no está permitida”. • Si la edad es menor o igual a 15 años, mostrará
		 * “Cadete”. • Si la edad es menor a 18 años, mostrará “Juvenil”. • En cualquier
		 * otro caso, mostrará “Senior”
		 */

		boolean salir = false;

		while (!salir) {
			System.out.println("intrduce una edad/s para salir");

			String dato = Entrada.cadena();
			if (dato.equalsIgnoreCase("s")) {
				System.out.println("saliendo");
				salir=true;
				
			}else if (dato.matches("-?[0-9]+")) {
				int esNumero=Integer.parseInt(dato);
				if (esNumero<14) {
					System.out.println("edad no permitida");
				}else if (esNumero<=15) {
					System.out.println("cadete");
				}else if (esNumero<18) {
					System.out.println("juvenil");
				}else {
					System.out.println("SENIOR");
				}
			}else {
				System.out.println("solo numero");
			}
			
			
			
			

		}

	}

}
