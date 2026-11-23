package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class sucecionNumeros {

	public static void main(String[] args) {
		// TPedir tres números y mostrarlos ordenados de mayor a menor.
		boolean salir = false;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean primerNumero = true;
		int cnt = 1;

		for (int i = 0; i < 3; i++) {

			System.out.println("numero " + cnt);
			int dato = Entrada.entero();
			if (primerNumero) {
				num1 = dato;
				num2 = num1;
				num3 = num1;
				primerNumero = false;
			} else {
				if (dato > num1) {
					num3 = num2;
					num2 = num1;
					num1 = dato;
				} else if (dato > num2) {
					num3 = num2;
					num2 = dato;

				} else if (dato > num3) {
					num3 = dato;
				}

			}
			cnt++;

		}

		System.out.println(num1 + " " + num2 + " " + num3);

	}// main

}
