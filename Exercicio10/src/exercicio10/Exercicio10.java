
package exercicio10;

import java.util.ArrayList;
import java.util.Iterator;


public class Exercicio10 {

    public static void main(String[] args) {
           ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(42);
        numeros.add(18);
        
        System.out.println("ARRAYLIST");
        System.out.println("numeros: " + numeros);
        
        System.out.println("\nPERCORRENDO");
        Iterator<Integer> iterator = numeros.iterator();
        
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println("Elemento: " + numero);
        }
    }
}
