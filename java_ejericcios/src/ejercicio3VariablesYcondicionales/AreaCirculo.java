package ejercicio3VariablesYcondicionales;

import java.text.DecimalFormat;

import utilidades.Entrada;

public class AreaCirculo {
	public static void main(String[] args) {
		boolean salir = false;
		int radio = 0;
		do {
			System.out.println("radio del circulo");
			String dato = Entrada.cadena();
			if (validacion(dato)) {
				radio = Integer.parseInt(dato);
				salir = true;
			} else {
				System.out.println("solo numeros");
			}

		} while (!salir);
		
		//area  A = πr²
		double area=0;
		
		area=Math.PI*(Math.pow(radio, 2));
		
		double areaR=Math.round(area*100.0)/100.0;//redondea
		DecimalFormat df=new DecimalFormat("#.00");//formatea visualmente
		
		System.out.println("el area del circulo es: "+areaR);
		System.out.println(df.format(area));
		
		
		
		

	}

	private static boolean validacion(String dato) {
		return dato.matches("[0-9]+");

	}
}
