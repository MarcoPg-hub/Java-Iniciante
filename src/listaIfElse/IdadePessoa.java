package listaIfElse;

import java.util.Scanner;

public class IdadePessoa {

	public static void main(String args[]) {

		/*
		 * Alg 103: entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir
		 * a idade da pessoa. Não se esqueça de verificar se o ano de nascimento é um
		 * ano válido.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano do seu nascimento sem ponto ou barras , Ex: ano - 2000 : ");

		int nascimento = sc.nextInt();

		System.out.println("Digite o ano atual sem ponto ou barras , Ex: ano - 2025 ");

		int anoAtual = sc.nextInt();

		int idade = anoAtual - nascimento;

		if (nascimento > 0) {
			System.out.println("Idade atual de " + idade + " anos.");
		} else {
			System.out.println("Ano inválido! Digite o ano de nascimento novamente.");
		}

		sc.close();
	}

}
