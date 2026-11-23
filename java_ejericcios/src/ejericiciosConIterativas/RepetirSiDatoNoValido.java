package ejericiciosConIterativas;

import utilidades.Entrada;

public class RepetirSiDatoNoValido {

	public static void main(String[] args) {
		/*
		 * Crea un algoritmo que solicite al usuario un número hasta que el número
		 * cumpla alguna de las siguientes condiciones: • Está comprendido entre
		 * [-3,-5]. • Es 0. • Está comprendido entre [35,70]. • Está comprendido entre
		 * (80, 100]. El cumplimiento de cualquiera de esas 4 condiciones hará que se
		 * considere valor correcto, y por tanto terminará el algoritmo informando de
		 * que el dato recibido es correcto.
		 */
		boolean salir = false;
		

		while (!salir) {
			System.out.println("intrdocir un numero");
			int dato = Entrada.entero();
			boolean numeroCorrecto = (dato < -3 && dato > -5) || (dato == 0) || (dato > 35 && dato < 75)
					|| (dato > 80 && dato < 100);
			if (numeroCorrecto) {
				salir=true;
			}else {
				System.out.println("numero InCorrecto");
			}
			
		}
		System.out.println("numero Correcto....saliendo...0");

	}

}
