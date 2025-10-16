package listaIfElse;

import java.util.Scanner;

public class IdadePessoaDois {

	public static void main(String args[]) {

		/*
		 * Alg 125: entrar com a idade de uma pessoa e informar: se é maior de idade, se
		 * é menor de idade ou se é maior de 65 anos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18 && idade <= 65) {
			System.out.println("Maior de idade.");
		} else if (idade < 18 && idade > 0) {
			System.out.println("Menor de idade.");
		} else if (idade > 65) {
			System.out.println("Maior de 65 anos.");
		} else {
			System.out.println("Idade inválida. Entre com a idade novamente.");
		}

		sc.close();
	}

}
