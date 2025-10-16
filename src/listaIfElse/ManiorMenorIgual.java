package listaIfElse;

import java.util.Scanner;

public class ManiorMenorIgual {

	public static void main(String args[]) {

		/*
		 * Alg 102: entrar com um número e imprimir uma das mensagens: maior do que 20,
		 * igual a 20 ou menor do que 20
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para começar a verificação: ");

		int num = sc.nextInt();

		if (num > 20) {
			System.out.println("O número inserido " + num + " é maior do que 20.");
		} else if (num == 20) {
			System.out.println("O número inserido " + num + " é igual a 20.");
		} else {
			System.out.println("O número inserido " + num + " é menor do que 20.");
		}

		sc.close();
	}

}
