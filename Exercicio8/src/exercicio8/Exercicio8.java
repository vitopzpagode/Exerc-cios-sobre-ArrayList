
package exercicio8;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio8 {

    public static void main(String[] args) {
         ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Primeiro");
        elementos.add("Segundo");
        elementos.add("Terceiro");
        elementos.add("Quarto");
        elementos.add("Quinto");
        elementos.add("Sexto");
        
        System.out.println("ORDEM ORIGINAL");
        System.out.println(elementos);
        

        Collections.reverse(elementos);
        System.out.println("\nORDEM INVERTIDA (Collections.reverse)");
        System.out.println(elementos);
        
        // Método 2: Loop manual (não modifica original)
        System.out.println("\nINVERTENDO MANUALMENTE");
        ArrayList<String> invertida = new ArrayList<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            invertida.add(elementos.get(i));
        }
        System.out.println(invertida);
    }
}
    
    

