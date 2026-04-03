
package exercicio12;

import java.util.ArrayList;
import java.util.Collections;


public class Exercicio12 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(23);
        numeros.add(91);
        numeros.add(34);
        
        System.out.println("ARRAYLIST");
        System.out.println(numeros);
        
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        
        System.out.println("\nMAIOR E MENOR VALOR");
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
    
    

