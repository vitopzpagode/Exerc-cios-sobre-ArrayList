
package exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Exercicio3 {


    public static void main(String[] args) {
      

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        
        System.out.println("=== 10 NÚMEROS ALEATÓRIOS (1-100) ===");
        
        for (int i = 0; i < 10; i++) {
            int valor = random.nextInt(100) + 1;
            numeros.add(valor);
        }
        
        System.out.println("Lista original: " + numeros);
        
        Collections.sort(numeros);
        
        System.out.println("Lista ordenada: " + numeros);
    }
}
    
    

