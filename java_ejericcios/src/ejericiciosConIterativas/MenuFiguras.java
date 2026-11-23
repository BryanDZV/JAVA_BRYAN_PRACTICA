package ejericiciosConIterativas;

import utilidades.Entrada;

public class MenuFiguras {

	public static void main(String[] args) {
		/*
		 * MenuFiguras Crea un algoritmo que nos muestre el siguiente menú:
		 * "=== Cálculo de áreas ===" "1-Triángulo" "2-Cuadrado" "3-Rectángulo"
		 * "0-Salir" En función de la opción que se pulse, se calculará el área de la
		 * figura correspondiente o un mensaje de despedida para la opción ‘0’,
		 * cualquier otra opción se considerará opción no válida y deberá informase de
		 * ello. Se solicitará al usuario la base en el caso del cuadrado y la base y la
		 * altura para triángulo y rectángulo. Se solicitará reiteradamente que se pase
		 * una opción mientras sea distinta de 0.
		 */
		
		
		boolean salir=false;
		do {
			System.out.println("calculo de areas");
			System.out.println("1.triangulo \n 2.cuadrado\n 3.rectangulo\n 0.SALIR");
			String dato=Entrada.cadena();
			if (!dato.matches("[0-3]")) {
				System.out.println("OPCION NO VALIDA");
				
			}else if (Integer.parseInt(dato)==0) {
				System.out.println("saliendo...");
				salir=true;
				
			}else {
				switch (Integer.parseInt(dato)) {
				case 1:
					System.out.println("base del triangulo");
					int baseT=Entrada.entero();
					System.out.println("altura del triangulo");
					int alturaT=Entrada.entero();
					int areaT=(baseT*alturaT)/2;
					System.out.println("el area del triangulo es:"+ areaT);
					break;
				case 2:
					System.out.println("base del cuadrado");
					int baseC=Entrada.entero();
			
					int areaC=(baseC*baseC);
					System.out.println("el area del cuadrado es:"+ areaC);
					break;
				case 3:
					System.out.println("base del rectangulo");
					int baseR=Entrada.entero();
					System.out.println("altura del rectangulo");
					int alturaR=Entrada.entero();
					int areaR=(baseR*alturaR);
					System.out.println("el area del rectangulo es:"+ areaR);
					break;

				default:
					System.out.println("OPCION NO VALIDA");
					break;
				}
			}
		} while (!salir);

	}

}
