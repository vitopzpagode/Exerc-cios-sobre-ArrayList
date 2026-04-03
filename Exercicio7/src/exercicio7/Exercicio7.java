
package exercicio7;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Exercicio7 {

    public static void main(String[] args) {
         ArrayList<Integer> numerosComRepetidos = new ArrayList<>();
        numerosComRepetidos.add(5);
        numerosComRepetidos.add(2);
        numerosComRepetidos.add(8);
        numerosComRepetidos.add(2);
        numerosComRepetidos.add(5);
        numerosComRepetidos.add(11);
        numerosComRepetidos.add(8);
        numerosComRepetidos.add(5);
        
        System.out.println("LISTA COM REPETIDOS");
        System.out.println("Original: " + numerosComRepetidos);
        
        // Método 1: Usando LinkedHashSet (mantém ordem)
        ArrayList<Integer> numerosUnicos = new ArrayList<>(
            new LinkedHashSet<>(numerosComRepetidos)
        );
        
        System.out.println("\nSEM REPETIDOS (em ordem)");
        System.out.println("Resultado: " + numerosUnicos);
        System.out.println("Tamanho: " + numerosUnicos.size());
    }
}