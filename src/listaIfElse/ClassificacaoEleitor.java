package listaIfElse;

import java.util.Scanner;

public class ClassificacaoEleitor {

	public static void main(String args[]) {

		/*
		 * Alg 135: criar um algoritmo que leia a idade de uma pessoa e informar a sua
		 * classe eleitoral:
		 * - Não eleitor (abaixo de 16 anos)
		 * - Eleitor obrigatório (entre 18 e 65 anos)
		 * - Eleitor facultativo (entre 16 e 17 anos e maior que 65 anos)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade para definirmos a classe eleitoral: ");
		int idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("Idade inválida, digite novamente.");
		} else if (idade < 16) {
			System.out.println("Não eleitor.");
		} else if ((idade >= 16 && idade < 18) || idade > 65) {
			System.out.println("Eleitor facultativo.");
		} else { // aqui já cobre de 18 até 65
			System.out.println("Eleitor obrigatório.");
		}

		sc.close();
	}
}
