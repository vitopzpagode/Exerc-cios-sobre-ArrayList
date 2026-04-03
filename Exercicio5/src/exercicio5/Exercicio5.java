
package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();
        
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");
        cidades.add("Salvador");
        
        System.out.println("=== LISTA ORIGINAL DE CIDADES ===");
        System.out.println(cidades);
        
        System.out.print("\nDigite o nome da cidade para substituir: ");
        String cidadeAntiga = scanner.nextLine();
        
        if (cidades.contains(cidadeAntiga)) {
            System.out.print("Digite a nova cidade: ");
            String novaCidade = scanner.nextLine();
            
            int indice = cidades.indexOf(cidadeAntiga);
            cidades.set(indice, novaCidade);
            
            System.out.println("\n=== LISTA ATUALIZADA ===");
            System.out.println("Substituída '" + cidadeAntiga + "' por '" + novaCidade + "'");
            System.out.println(cidades);
        } else {
            System.out.println("❌ Cidade '" + cidadeAntiga + "' não encontrada!");
        }
        
        scanner.close();
    }
}
