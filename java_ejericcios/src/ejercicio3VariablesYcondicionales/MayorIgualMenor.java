package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class MayorIgualMenor {

	public static void main(String[] args) {
		boolean salir=false;
		int mayor=0;
		boolean primerNumero=true;
		int cnt=1;
		do {
			System.out.println("pon un numero "+cnt);
			int dato=Entrada.entero();
			if (primerNumero) {
				mayor=dato;
				primerNumero=false;
				cnt++;
			}else {
				if (mayor<dato) {
					System.out.println("el numero "+mayor+ " es menor a "+dato);
				}else if (mayor==dato) {
					System.out.println("el numero "+mayor+ " es igual a "+dato);
				}else {
					System.out.println("el numero "+mayor+ " es mayor a "+dato);
				}
				salir=true;
			}
			
			
		} while (!salir);

	}

}
