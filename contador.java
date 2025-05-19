

import java.util.Scanner;

public class contador {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int obtenerNumero(String mensaje) {
        int numeroTemporal = 0;
        while (numeroTemporal <= 0) {
            System.out.println(mensaje);
            numeroTemporal = scanner.nextInt();
        }
        return numeroTemporal;
    }

    public static void main(String[] args) {
        System.out.println("Conteo de 2 en 2 desde 0 hasta 20:");
        
        int contador = 0;
        while (contador <= 20) {
            System.out.println(contador);
            contador += 2;  
        }
    }
}