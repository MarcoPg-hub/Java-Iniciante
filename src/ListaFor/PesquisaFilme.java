package ListaFor;

import java.util.Scanner;

public class PesquisaFilme {

	public static void main(String args[]) {
		/*
		 * Alg 246: No dia da estréia do filme “Senhor dos Anéis”, uma grande emissora
		 * de TV realizou uma pesquisa logo após o encerramento do filme. Cada
		 * espectador respondeu a uma questionário no qual constava sua idade, e sua
		 * opnião em relação ao filme: excelente – 3, bom – 2, regular -1. Criar um
		 * algoritmo que receba a idade e a opinião de 20 espectadores, calcule e
		 * emprima: a média das idades das pessoas que responderam excelente a
		 * quantidade de pessoas que responderam regular a percentagem de pessoas que
		 * responderam bom entre todos os expectadores analisados.
		 */

		Scanner sc = new Scanner(System.in);

		double mediaIdade;
		double porcentagemBom;
		int regular = 0; int bom = 0; int excelente = 0;
		int idadeSoma = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite sua idade : ");
			int idade = sc.nextInt();
			System.out.println("Digite - 1 - regular.\nDigite - 2 - bom.\nDigite - 3 - excelente.");
			int opiniao = sc.nextInt();
			if (opiniao == 1) {
				regular++;
			} else if (opiniao == 2) {
				bom++;
			} else if (opiniao == 3) {
				idadeSoma += idade;
				excelente++;
			} else {
				System.out.println("Opção inválida, tente novamente.");
				i--; // repete a pessoa
			}
		}

		mediaIdade = idadeSoma / excelente;
		porcentagemBom = bom * 100 / (regular + bom + excelente);

		System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Média de idade (opinião excelente): %.2f anos%n", mediaIdade);
        System.out.printf("Quantidade de respostas 'regular': %d%n", regular);
        System.out.printf("Percentual de respostas 'bom': %.2f%%%n", porcentagemBom);

		sc.close();
	}

}
