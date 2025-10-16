package listaIfElse;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        /*
         * Alg 145:
         * A biblioteca de uma universidade deseja criar um algoritmo que leia:
         * - o nome do livro que será emprestado,
         * - o tipo de usuário (professor ou aluno)
         * e imprima um recibo com:
         * - Nome do livro
         * - Tipo de usuário
         * - Total de dias para devolução
         * Considerar que:
         * - Professor: 10 dias
         * - Aluno: 3 dias
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String livro = sc.nextLine();

        System.out.print("Você é aluno ou professor? ");
        String usuario = sc.nextLine().toUpperCase(); // normaliza a entrada

        int totalDias = 0;

        if (usuario.equals("ALUNO")) {
            totalDias = 3;
        } else if (usuario.equals("PROFESSOR")) {
            totalDias = 10;
        } else {
            System.out.println("Usuário inválido.");
            sc.close();
            return; // encerra o programa
        }

        System.out.println("\nRecibo de Empréstimo:");
        System.out.println("Nome do livro: " + livro);
        System.out.println("Tipo de usuário: " + usuario);
        System.out.println("Total de dias: " + totalDias);

        sc.close();
    }
}
