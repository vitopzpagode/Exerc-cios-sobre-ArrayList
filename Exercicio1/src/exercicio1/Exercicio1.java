
package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        ArrayList<Integer> numeros = new ArrayList<>();
        

        System.out.println("=== CADASTRO DE 5 NÚMEROS ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        

        System.out.println("\n=== ELEMENTOS ARMAZENADOS ===");
        System.out.println("ArrayList contém " + numeros.size() + " elementos:");
        

        System.out.print("Números: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }
        

        System.out.println("\nUsando for-each:");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        

        System.out.println("\nFormato toString(): " + numeros);
        
        scanner.close();
    }
}
    
    

