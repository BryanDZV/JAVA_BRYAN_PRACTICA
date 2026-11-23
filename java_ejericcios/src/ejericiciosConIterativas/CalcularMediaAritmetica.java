package ejericiciosConIterativas;

import utilidades.Entrada;

public class CalcularMediaAritmetica {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que pida números al usuario hasta que se pase la cadena
		 * “fin”. Después mostrará la media aritmética de todos esos números
		 * introducidos.
		 * 
		 * sumar todos los numero divir la suma total entre el NUMERO DE NUMEROS
		 * 
		 * NECESITO UN CONTATO PARA NUMERO DE ELEMENTOS NECESITO UN CONTADOR PARA IR
		 * SUMANDO NECESITO UNa variable resultado de la OPERACION
		 */
		int suma = 0;
		int nNumeros = 0;
		int resultado = 0;
		boolean salir = false;

		do {
			System.out.println("intrduce numeros para media arimetica\n (FIN) PARA SALIR");
			String dato = Entrada.cadena();
			if (dato.equalsIgnoreCase("fin")) {
				if (nNumeros==0) {
					System.out.println("NO SE INTRODUJERON NUMEROS media arimetica:\n"+0);
				}else {
					
					resultado = (suma / nNumeros);
					System.out.println("media arimetica:..\n " + resultado);

					System.out.println("saliendo---.....");
					salir = true;
				}

			} else if (!dato.matches("[0-9]+")) {
				System.out.println("SOLO NUMEROS");
			} else {
				int datoNumero = Integer.parseInt(dato);
				suma += datoNumero;
				nNumeros++;

			}

		} while (!salir);

	}

}
