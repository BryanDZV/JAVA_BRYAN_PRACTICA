package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class EstudioCantidades {

	public static void main(String[] args) {

		/*
		 * 15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
		 * media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos
		 * que miden más de 1.75.
		 */
		int cntMayores18 = 0;
		int cntAlturaTope = 0;
		int sumaEdades = 0;
		double sumaEstaturas = 0;

		int alumnos = 5;

		for (int i = 0; i < alumnos; i++) {
			System.out.println("Edad del alumno:");
			int edad = Entrada.entero();
			if (edad > 18) {
				cntMayores18++;
			}
			sumaEdades += edad;

			System.out.println("Estatura del alumno en cm (ej: 178.5):");
			double estatura = Entrada.entero();//Entrada.real();  usar real sive hacien publico en entrada
			if (estatura > 175) {
				cntAlturaTope++;
			}
			sumaEstaturas += estatura;
		}

		// medias
		double mediaEdades = (double) sumaEdades / alumnos;
		double mediaEstaturas = sumaEstaturas / alumnos;

		System.out.println("Edad media de los alumnos: " + mediaEdades);
		System.out.println("Estatura media de los alumnos: " + mediaEstaturas);
		System.out.println("Alumnos mayores de 18 años: " + cntMayores18);
		System.out.println("Alumnos con más de 1.75m: " + cntAlturaTope);
	}
}
