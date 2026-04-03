
package exercicio11;

import java.util.ArrayList;

public class Exercicio11 {


    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(12.5);
        valores.add(8.75);
        valores.add(23.0);
        valores.add(15.99);
        valores.add(7.25);
        
        System.out.println("VALORES NO ARRAYLIST");
        System.out.println(valores);
        
        double soma = 0.0;
        for (Double valor : valores) {
            soma += valor;
        }
        
        System.out.printf("\nSoma total: %.2f%n", soma);
    }
}
