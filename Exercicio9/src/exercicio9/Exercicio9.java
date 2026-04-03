
package exercicio9;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio9 {

    public static void main(String[] args) {
          ArrayList<String> nomesOriginais = new ArrayList<>();
        nomesOriginais.add("Maria");
        nomesOriginais.add("João");
        nomesOriginais.add("Ana");
        nomesOriginais.add("Pedro");
        nomesOriginais.add("Lucas");
        
        System.out.println("=== ARRAYLIST ORIGINAL ===");
        System.out.println(nomesOriginais);
        
        ArrayList<String> nomesCopiados = new ArrayList<>(nomesOriginais);
        
        System.out.println("\n=== ARRAYLIST COPIADO ===");
        System.out.println(nomesCopiados);
        
        System.out.println("\n=== CONFIRMAÇÃO ===");
        System.out.println("Original tem " + nomesOriginais.size() + " elementos");
        System.out.println("Cópia tem " + nomesCopiados.size() + " elementos");
        System.out.println("São iguais? " + nomesOriginais.equals(nomesCopiados));
    }
}
