import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ingresar el primer número
        System.out.println("Por favor, introduce el primer número: ");
        int numero1 = scanner.nextInt();
        // ingresar el segundo número
        System.out.println("Por favor, introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        // calcular la multiplicación repitiendo la suma del segundo número, el primer número veces
        int multiplicacion = 0;
        for(int i = 0; i < numero1; i++){
            multiplicacion += numero2;
        }
        // mostrar la multiplicación sin usar el signo de multiplicación
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }
}