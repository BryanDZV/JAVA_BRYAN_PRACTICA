package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Ordenacion {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de mayor a menor

		int num1 = 0;
		boolean primerNumero=true;
		int cnt = 1;
		boolean salir = false;
		do {
			System.out.println("numero " + cnt);
			int dato = Entrada.entero();
			
			if (primerNumero) {
				num1=dato;
				cnt++;
				primerNumero=false;
			}else {
				if (num1>dato) {
					System.out.println("mayor a menor "+num1+"---"+dato);
					primerNumero=true;
					cnt=1;
					salir=true;
					
				}else {
					System.out.println("mayor a menor "+dato+"----"+num1);
					primerNumero=true;
					cnt=1;
					salir=true;
				}
			}
		} while (!salir);

	}

}
