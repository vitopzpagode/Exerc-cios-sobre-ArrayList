
package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Impressora");
        produtos.add("Webcam");
        produtos.add("Headset");
        
        System.out.println("=== PRODUTOS DISPONÍVEIS ===");
        System.out.println(produtos);
        System.out.println();
        
        System.out.print("Digite o nome do produto para buscar: ");
        String produtoBusca = scanner.nextLine();
        
        if (produtos.contains(produtoBusca)) {
            System.out.println("✅ Produto '" + produtoBusca + "' ENCONTRADO na lista!");
            int posicao = produtos.indexOf(produtoBusca);
            System.out.println("Posição na lista: " + posicao);
        } else {
            System.out.println("❌ Produto '" + produtoBusca + "' NÃO ENCONTRADO!");
        }
        
        scanner.close();
    }
}
