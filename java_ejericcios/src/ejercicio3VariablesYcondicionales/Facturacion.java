package ejercicio3VariablesYcondicionales;

import utilidades.Entrada;

public class Facturacion {

	public static void main(String[] args) {
		/*
		 * 17. Una empresa que se dedica a la venta de desinfectantes necesita un
		 * programa para gestionar las facturas. En cada factura figura: el código del
		 * artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5
		 * facturas introducidas: Facturación total, cantidad en litros vendidos del
		 * artículo 1 y cuantas facturas se emitieron de más de 600 €.
		 */
		int facturacionTotal = 0;
		int cantidadArticulo1 = 0;
		int facturasMas600 = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("FACTURA " + i);
			System.out.print("Código de artículo: ");
			String codigo = Entrada.cadena();

			System.out.print("Cantidad vendida en litros: ");
			int cantidad = Entrada.entero();

			System.out.print("Precio por litro: ");
			int precio = Entrada.entero();

			int facturacionIndividual = cantidad * precio;
			facturacionTotal += facturacionIndividual;

			if (codigo.equals("1")) {
				cantidadArticulo1 += cantidad; // acumula todos los litros de código 1
			}

			if (facturacionIndividual > 600) {
				facturasMas600++;
			}
		}

		System.out.println("FACTURACIÓN TOTAL: " + facturacionTotal + " €");
		System.out.println("Cantidad de litros vendidos del artículo 1: " + cantidadArticulo1);
		System.out.println("Facturas de más de 600 €: " + facturasMas600);
	}
}
