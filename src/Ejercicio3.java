import javax.swing.*;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio3 {

    public static void main(String[] args) {


        String numero1= JOptionPane.showInputDialog("Por favor, introduce un número: ");
        String numero2 = JOptionPane.showInputDialog("Por favor, introduce un número: ");
        String numero3 = JOptionPane.showInputDialog("Por favor, introduce un número: ");
        String numero4 = JOptionPane.showInputDialog("Por favor, introduce un número: ");
        String numero5 = JOptionPane.showInputDialog("Por favor, introduce un número: ");
        //convertir las String a array de int
        int[] numeros = {
                Integer.parseInt(numero1),
                Integer.parseInt(numero2),
                Integer.parseInt(numero3),
                Integer.parseInt(numero4),
                Integer.parseInt(numero5)
        };
        //ordenar números
        Arrays.sort(numeros);
        //muestre array
        JOptionPane.showMessageDialog(null,Arrays.toString(numeros));

    }
}
