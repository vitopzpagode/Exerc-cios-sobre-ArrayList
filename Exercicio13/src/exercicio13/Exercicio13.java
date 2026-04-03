
package exercicio13;

import java.util.ArrayList;

public class Exercicio13 {

    public static void main(String[] args) {
          ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);
        lista1.add(50);
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(60);
        lista2.add(70);
        lista2.add(80);
        lista2.add(90);
        lista2.add(100);
        
        ArrayList<Integer> listaMesclada = new ArrayList<>();
        listaMesclada.addAll(lista1);
        listaMesclada.addAll(lista2);
        
        System.out.println("LISTAS ORIGINAIS");
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        
        System.out.println("\nMESCLADO");
        System.out.println(listaMesclada);
        System.out.println("Total de elementos: " + listaMesclada.size());
    }
}
