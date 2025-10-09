package ListaFor;

import java.util.Scanner;

public class Ricci {

    public static void main(String args[]) {

        /*
         * Alg 209: série de Ricci
         * - Dois primeiros termos fornecidos pelo usuário
         * - Demais termos: soma dos dois anteriores
         * - Imprimir os n primeiros termos e a soma
         * - É necessário pelo menos 3 termos
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos (mínimo 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Número de termos inválido! Deve ser pelo menos 3.");
        } else {
            System.out.print("Digite o 1º termo: ");
            int primeiro = sc.nextInt();

            System.out.print("Digite o 2º termo: ");
            int segundo = sc.nextInt();

            int soma = primeiro + segundo;

            System.out.print("Série de Ricci: " + primeiro + " " + segundo + " ");

            int proximo = 0;
            int termoAnterior = primeiro;
            int termoAtual = segundo;

            for (int i = 3; i <= n; i++) {
                proximo = termoAnterior + termoAtual;
                System.out.print(proximo + " ");
                soma += proximo;

                // Atualiza os termos
                termoAnterior = termoAtual;
                termoAtual = proximo;
            }

            System.out.println("\nSoma dos termos: " + soma);
        }

        sc.close();
    }
}