package ListaFor;

import java.util.Scanner;

public class MediaTurmaAlunoDois {

    public static void main(String args[]) {

        /*
         * Alg 255: uma escola tem 5 turmas e cada turma tem n alunos.
         * Criar um algoritmo que imprima por turma:
         * - total de alunos com média superior a 7
         * - média geral da escola
         */

        Scanner sc = new Scanner(System.in);

        int turmas = 5;
        int totalAlunosEscola = 0;
        double somaMediasTurmas = 0;

        for (int i = 1; i <= turmas; i++) {
            System.out.print("\nDigite a quantidade de alunos da turma " + i + ": ");
            int qtdAlunos = sc.nextInt();

            double somaNotasTurma = 0;
            int alunosAcima7 = 0;

            for (int j = 1; j <= qtdAlunos; j++) {
                System.out.print("Digite a média do aluno " + j + ": ");
                double nota = sc.nextDouble();

                somaNotasTurma += nota;
                totalAlunosEscola++;

                if (nota > 7.0) {
                    alunosAcima7++;
                }
            }

            double mediaTurma = somaNotasTurma / qtdAlunos;
            somaMediasTurmas += mediaTurma;

            System.out.printf("→ Turma %d teve %d aluno(s) com média > 7.%n", i, alunosAcima7);
            System.out.printf("→ Média da turma %d: %.2f%n", i, mediaTurma);
        }

        double mediaGeralEscola = somaMediasTurmas / turmas;

        System.out.println("\n=== RESULTADOS FINAIS ===");
        System.out.printf("Média geral da escola: %.2f%n", mediaGeralEscola);
        System.out.println("Total de alunos na escola: " + totalAlunosEscola);

        sc.close();
    }
}
