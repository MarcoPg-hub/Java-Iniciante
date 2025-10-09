package ListaFor;

import java.util.Scanner;

public class InformacoesCampeonato {

	public static void main(String[] args) {
        /*
         * Alg 247: Num campeonato europeu de volleyball, se inscreveram 30 países.
         * Sabendo-se que na lista oficial de cada país consta, além de outros dados,
         * peso e idade de 12 jogadores, criar um algoritmo que apresente as seguintes
         * informações:
         * - o peso médio e a idade média de cada um dos times
         * - o peso médio e a idade média de todos os participantes
         */

        Scanner sc = new Scanner(System.in);

        double somaPesoGeral = 0;
        double somaIdadeGeral = 0;
        int totalJogadores = 0;

        System.out.println("Campeonato Europeu de Volleyball - Inscrição");

        for (int i = 1; i <= 30; i++) {
            System.out.println("\nDigite o nome do país " + i + ":");
            String pais = sc.nextLine();

            double somaPesoPais = 0;
            double somaIdadePais = 0;

            for (int j = 1; j <= 12; j++) {
                System.out.println("Peso do " + j + "º jogador:");
                double peso = sc.nextDouble();

                System.out.println("Idade do " + j + "º jogador:");
                int idade = sc.nextInt();

                somaPesoPais += peso;
                somaIdadePais += idade;

                somaPesoGeral += peso;
                somaIdadeGeral += idade;
                totalJogadores++;
            }

            // Limpa o buffer
            sc.nextLine();

            double mediaPesoPais = somaPesoPais / 12;
            double mediaIdadePais = somaIdadePais / 12;

            System.out.printf("Média de peso do time %s: %.2f kg%n", pais, mediaPesoPais);
            System.out.printf("Média de idade do time %s: %.2f anos%n", pais, mediaIdadePais);
        }

        double mediaPesoGeral = somaPesoGeral / totalJogadores;
        double mediaIdadeGeral = somaIdadeGeral / totalJogadores;

        System.out.println("\n===== RESULTADO GERAL =====");
        System.out.printf("Peso médio de todos os jogadores: %.2f kg%n", mediaPesoGeral);
        System.out.printf("Idade média de todos os jogadores: %.2f anos%n", mediaIdadeGeral);

        sc.close();
    }
}
