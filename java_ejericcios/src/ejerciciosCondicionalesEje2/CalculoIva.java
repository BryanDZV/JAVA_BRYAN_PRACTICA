package ejerciciosCondicionalesEje2;

public class CalculoIva {

	public static void main(String[] args) {
		/*
		 * 3. CalculoIvaFactura
		 *  Crea un algoritmo que permita calcular el IVA de una
		 * factura. Esto se hará a partir de una base imponible y un porcentaje de IVA
		 * que se pedirán al usuario. Se calculará el IVA a pagar a Hacienda y el
		 * importe total de la factura. También deberá informarse de la forma de pago
		 * del IVA: DIFERIDO (si supera 200) o INMEDIATO en caso contrario.
		 */
		
		double iva=0.21;
		int bI=189;
		double aPagar=iva*bI;
		if (aPagar > 200) {
			System.out.println("IVA DIFERIDO");
		} else {
			System.out.println("IVA INMEDIATO");
			
		}
		
		//System.out.printf("%.2f%%",aPagar);
		System.out.println(aPagar);
	}

}
