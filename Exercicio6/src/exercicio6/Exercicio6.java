
package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio6 {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("=== CADASTRO DE PALAVRAS ===");
        System.out.print("Digite palavras (digite 'FIM' para terminar): ");
        
        while (true) {
            String palavra = scanner.next();
            if (palavra.equalsIgnoreCase("FIM")) {
                break;
            }
            palavras.add(palavra);
        }
        
        System.out.println("\nLista de palavras: " + palavras);
        System.out.print("Digite a palavra para contar ocorrências: ");
        String palavraBusca = scanner.next();
        
        int contador = 0;
        for (String palavra : palavras) {
            if (palavra.equalsIgnoreCase(palavraBusca)) {
                contador++;
            }
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("A palavra '" + palavraBusca + "' aparece " + contador + " vez(es)");
        
        scanner.close();
    }
}
