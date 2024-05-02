import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ingresar el número
        System.out.println("Por favor, introduce un número: ");
        int numero = scanner.nextInt();
        //calcule cuantos dígitos que el numero tiene
        int digitos = 1;//iniciar en 1 porque es el mínimo para tener
        int numeroInicial = numero; // Guardamos una copia del número original
        while(numero>9){
            //mientras que el número tiene números, lo dividimos entre 10 para eliminar uno e incrementamos el contador de dígitos en 1.
            digitos++;
            numero /= 10;
        }
        //muestre dígitos número
        System.out.println(numeroInicial + " tiene " + digitos + " dígitos.");
    }
}