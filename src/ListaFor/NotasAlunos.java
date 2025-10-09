package ListaFor;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Tabela de notas alunos===");
        System.out.println("----------------------------");

        int totalAlunos = 20;
        int alunosAcimaDe5 = 0;
        double somaMediasTurma = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            double notaAluno = 0;

            System.out.println("\nAluno " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.print("Nota da prova " + j + ": ");
                double nota = sc.nextDouble();
                notaAluno += nota;
            }

            double mediaAluno = notaAluno / 10.0;
            System.out.printf("→ Média do aluno %d: %.2f%n", i, mediaAluno);

            somaMediasTurma += mediaAluno;

            if (mediaAluno >= 5.0) {
                alunosAcimaDe5++;
            }
        }

        double mediaTurma = somaMediasTurma / totalAlunos;
        double percentualAcima5 = (alunosAcimaDe5 * 100.0) / totalAlunos;

        System.out.println("\n=== RESULTADOS FINAIS ===");
        System.out.printf("Média geral da turma: %.2f%n", mediaTurma);
        System.out.printf("Percentual de alunos com média >= 5.0: %.2f%%%n", percentualAcima5);

        sc.close();
    }
}
