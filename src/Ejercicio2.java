import java.util.Date;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ingresar el nombre
        System.out.println("Por favor, introduce el nombre: ");
        String nombre = scanner.next();
        //ingresar el appelido
        System.out.println("Por favor, introduce el apellido: ");
        String apellido = scanner.next();
        //ingresar el año de nacimiento
        System.out.println("Por favor, introduce el año de nacimiento: ");
        int ano = scanner.nextInt();
        //muestre la frase
        System.out.println("Hola, feliz día "+nombre+" "+apellido+" usted tiene "+(2024-ano)+" años de edad.");
    }
}
