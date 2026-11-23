package ejericiciosConIterativas;

import utilidades.Entrada;

public class SerieFibonacci {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que permita implementar la serie de Fibonacci. Para ello,
		 * se solicitará al usuario el número de elementos que quiere que contenga la
		 * serie. Deberá controlarse que este valor sea mayor que 0, informando en caso
		 * contrario y volviéndolo a solicitar. La serie de Fibonacci es: 0, 1, 1, 2, 3,
		 * 5, 8, 13, 21, 34, 55, 89, 144, … (Empieza por 0, 1. Los siguientes elementos
		 * son la suma de los dos anteriores).
		 * 
		 * solicitar un numero mayor a 0 fibobacie empieza con 0 ,1 y sucesivos suma de
		 * los dos anteriores
		 * 
		 * necetio un bucle hasta el numero de elementos necesito una variable para
		 * alamacenar la suma de dos numeros necesito un array para almacenar la serie
		 * con sus indices
		 *
		 * a=0 y b=1 siguiente=a+b
		 * 
		 * para haer la serie repito pero con datos actaulizados para eso:
		 * 
		 * a=b y b=siguiente y siguiente=a+b denuevo ..
		 */

		int a = 0;// anterior
		int b = 1;// actual
		int siguiente = a + b;
		System.out.println("intruce numero de elementos del fibonaci >0");
		int elemento = Entrada.entero();

		System.out.println("Serie de Fibonacci:");

		for (int i = 0; i < elemento; i++) {
			System.out.println(a);// mostara desde el principio

			siguiente = a + b;
			a = b;
			b = siguiente;
		}

//		
//		
//		boolean salir = false;
//	
//
//		do {
//
//			System.out.println("intruce el numero de elementos pra fibonaci >0");
//			String dato = Entrada.cadena();
//			if (!dato.matches("[0-9]+")) {
//				System.out.println("solo numeros");
//			} else {
//				int datoNumero = Integer.parseInt(dato);
//				if (datoNumero == 0) {
//					System.out.println("el numero debe ser mayor a 0");
//				} else {
//					int[] array = new int[datoNumero];
//					array[0] = 0;
//					array[1] = 1;
//					System.out.println(array[0]);
//					System.out.println(array[1]);
//					for (int i = 2; i < array.length; i++) {
//						array[i] = array[i - 1] + array[i - 2];
//						System.out.println(array[i]);
//					}
//					salir=true;
//
//				}
//			}
//		} while (!salir);

	}

}
