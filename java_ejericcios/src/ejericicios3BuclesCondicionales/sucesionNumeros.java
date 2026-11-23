package ejericicios3BuclesCondicionales;

public class sucesionNumeros {

	public static void main(String[] args) {
		/* Escribir todos los números del 100 al 0 de 7 en 7.*/
		
		for(int i=100;i>=0;i-=7) {
			System.out.println(i);
			
		}
		
		boolean salir=true;
		int i=100;
		System.out.println("+++++++++++++++++++++");
		while (i>=0) {
			
			System.out.println(i);
			i-=7;
		}

	}

}
