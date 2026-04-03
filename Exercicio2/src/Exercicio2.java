
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        

        System.out.println("=== LISTA ORIGINAL ===");
        System.out.println("Nomes: " + nomes);
        System.out.println("Total: " + nomes.size() + " nomes\n");
        

        System.out.print("Digite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();
        

        if (nomes.contains(nomeParaRemover)) {
            nomes.remove(nomeParaRemover);
            System.out.println("\n✅ Nome '" + nomeParaRemover + "' removido com sucesso!");
        } else {
            System.out.println("\n❌ Nome '" + nomeParaRemover + "' não encontrado na lista!");
        }
        

        System.out.println("\n=== LISTA ATUALIZADA ===");
        System.out.println("Nomes: " + nomes);
        System.out.println("Total: " + nomes.size() + " nomes");
        
        scanner.close();
    }
}