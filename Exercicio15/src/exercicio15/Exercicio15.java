
package exercicio15;

import java.util.ArrayList;

public class Exercicio15 {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno("Vitor", 8.5));
        alunos.add(new Aluno("Felipe", 7.2));
        alunos.add(new Aluno("Murilo", 9.0));
        alunos.add(new Aluno("Joaquim", 6.8));
        alunos.add(new Aluno("Ricardo", 8.0));
        
        System.out.println("LISTA DE ALUNOS");
        double somaNotas = 0;
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            somaNotas += aluno.getNota();
        }
        
        double media = somaNotas / alunos.size();
        System.out.printf("\n📊 MÉDIA DAS NOTAS: %.2f%n", media);
    }
}
