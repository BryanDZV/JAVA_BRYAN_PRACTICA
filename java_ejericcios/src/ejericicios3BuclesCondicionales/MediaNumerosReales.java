package ejericicios3BuclesCondicionales;
import utilidades.Entrada;

public class MediaNumerosReales {

    public static void main(String[] args) {
    	/*
		 * Pedir 10 números. Mostrar la media de los números positivos, la media de los
		 * números negativos y la cantidad de ceros.
		 */
        int cantidad = 10;
        int cntPositivos = 0, cntNegativos = 0, cntCeros = 0;
        int sumaPositivos = 0, sumaNegativos = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Di un número:");
            int dato = Entrada.entero();

            if (dato == 0) {
                cntCeros++;
            } else if (dato < 0) {
                sumaNegativos += dato;
                cntNegativos++;
            } else {
                sumaPositivos += dato;
                cntPositivos++;
            }
        }

        // medias
        if (cntPositivos == 0) {
            System.out.println("No hay positivos.");
        } else {
            double mediaPositivos = (double) sumaPositivos / cntPositivos;
            System.out.println("Media positivos: " + mediaPositivos);
        }

        if (cntNegativos == 0) {
            System.out.println("No hay negativos.");
        } else {
            double mediaNegativos = (double) sumaNegativos / cntNegativos;
            System.out.println("Media negativos: " + mediaNegativos);
        }

        System.out.println("Cantidad de ceros: " + cntCeros);
    }
}
