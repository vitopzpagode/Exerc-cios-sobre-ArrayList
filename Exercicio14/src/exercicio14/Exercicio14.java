
package exercicio14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\nGERENCIADOR DE TAREFAS");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("✅ Tarefa adicionada!");
                    break;
                    
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("❌ Nenhuma tarefa para remover!");
                    } else {
                        System.out.println("Tarefas disponíveis:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa para remover: ");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < tarefas.size()) {
                            String removida = tarefas.remove(indice);
                            System.out.println("🗑️ Tarefa '" + removida + "' removida!");
                        } else {
                            System.out.println("❌ Índice inválido!");
                        }
                    }
                    break;
                    
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("📭 Nenhuma tarefa cadastrada!");
                    } else {
                        System.out.println("\n📋 SUAS TAREFAS (" + tarefas.size() + "):");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("👋 Saindo...");
                    break;
                    
                default:
                    System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
