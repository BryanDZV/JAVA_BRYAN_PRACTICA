package ejerciciosCondicionalesEje2;

public class Cilcicas {

	public static void main(String[] args) {
		String[] semana = { "lunes", "martes", "miercoles", "jueves", "viernes" };

		int repetir = 1;
		boolean salir = false;

		while (!salir) {

			System.out.println("vuelta:" + repetir);
			for (int i = 0; i < semana.length; i++) {
				System.out.println(semana[i]);

			}
			System.out.println("\n");

			if (repetir == 3) {
				salir = true;
			}
			repetir++;

		}

		System.out.println("fin ");

		// usando modulo %
		System.out.println("*********MOPDULO**********");
		int vueltas = 3;
		int dias = 5;
		int total = vueltas * dias;
		int vuelta = 0;
		for (int i = 0; i < total; i++) {
			System.out.println(semana[i % semana.length]);
			if ((i + 1) % semana.length == 0) {
				vuelta++;
				System.out.println("vuelta: "+vuelta+"\n");
			}

		}

	}

}
