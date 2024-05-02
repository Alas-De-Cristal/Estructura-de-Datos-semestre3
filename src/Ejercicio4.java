import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ingresar el número
        System.out.println("Por favor, introduce un número: ");
        int numero = scanner.nextInt();
        //Calcular el número límite que se mostrará
        int numeroLimite = numero;
        if(numero%2 != 0){
            numeroLimite -= 1;
        }
        //muestre por consola todos los números pares que se encuentran entre el 1 y el numero ingresado
        for(int i=1;i<numeroLimite;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
        if(numeroLimite>0) {
            System.out.print(numeroLimite + ".");
        }
    }
}
