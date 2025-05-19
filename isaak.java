
import java.util.Scanner;
public class isaak{
private static final Scanner scanner = new Scanner(System.in);
public static int obtenerNumero (String mensaje) {
    int     numeroTemporal = 0;
    while (numeroTemporal <= 0){
System.out.println(mensaje);
numeroTemporal = scanner.nextInt();
    }
return numeroTemporal;
}

public static void main(String[] args) {
    int numero = obtenerNumero("Ingresa un numero:");
    int numero2 = obtenerNumero("Ingresa un numero:");

    int resultado = numero / numero2;
    System.out.println("El resultado de la division es: " + resultado);
}
}