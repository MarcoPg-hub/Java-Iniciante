package listaIfElse;

import java.util.Scanner;

public class NomeLetra {

	public static void main(String args[]) {

		/*
		 * Alg 106: entrar com o nome e imprimi-lo se o primeiro caractere for a letra A
		 * (considerar letra maiuscula ou minuscula)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome completo: ");

		String nome = sc.nextLine();
		char primeiraLetra = Character.toLowerCase(nome.charAt(0)); // pega a primeira letra e considera maiúsculo e minúsculo

		if (primeiraLetra == 'a') {
			System.out.println("Nome : " + nome);
		} else {
			System.out.println("O nome não começa com a letra A.");
		}

		sc.close();
	}
}
