package ListaFor;

import java.util.Scanner;

public class Fetuccine {

    public static void main(String args[]) {

        /*
         * Alg 210: Série de FETUCCINE
         * - Dois primeiros termos fornecidos pelo usuário
         * - Demais termos:
         *   Ai = Ai-1 + Ai-2, se i ímpar
         *   Ai = Ai-1 - Ai-2, se i par
         * - Imprimir os 10 primeiros termos
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º termo: ");
        int primeiro = sc.nextInt();

        System.out.print("Digite o 2º termo: ");
        int segundo = sc.nextInt();

        System.out.print("Série de FETUCCINE: " + primeiro + " " + segundo + " ");

        int termoAnterior = primeiro;
        int termoAtual = segundo;
        int proximo;

        for (int i = 3; i <= 10; i++) { // a partir do 3º termo
            if (i % 2 != 0) { // i ímpar
                proximo = termoAnterior + termoAtual;
            } else { // i par
                proximo = termoAtual - termoAnterior;
            }

            System.out.print(proximo + " ");

            // atualiza os termos
            termoAnterior = termoAtual;
            termoAtual = proximo;
        }

        sc.close();
    }
}