package ejericicios3BuclesCondicionales;

public class ProductoDeImpares {
    public static void main(String[] args) {
        int productoTotal = 1;
        int cnt = 1; // primer número impar
        int cantidad = 10;
        
        for (int i = 0; i < cantidad; i++) {
            productoTotal *= cnt;
            cnt += 2; // siguiente impar
        }
        
        System.out.println(productoTotal);
    }
}
