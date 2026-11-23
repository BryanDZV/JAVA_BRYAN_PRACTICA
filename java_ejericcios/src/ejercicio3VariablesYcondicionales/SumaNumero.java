package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class SumaNumero {

	public static void main(String[] args) {
		/*
		 * 14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
		 */
		int cantidad = 10;
		int sumaTotal = 0;
		int cnt = 1;
		int mayoresAMil = 0;
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Suelo " + cnt);
			int dato = Entrada.entero();
			if (dato > 1000) {
				mayoresAMil++;
			}
			sumaTotal += dato;
			cnt++;

		}
		
		System.out.println("Suma de sueldos es "+sumaTotal);
		System.out.println("suelos mayores a 1000 es "+mayoresAMil);

	}

}
