package listaIfElse;

import java.util.Scanner;

public class PronomeImprimir {

	public static void main(String ar[]) {

		// Alg 107: entrar com o nome de uma pessoa e só imprimi-lo se o prenome for
		// JOSE

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome completo:");
		String nome = sc.nextLine();

		// Divide o nome em partes (separadas por espaço)
		String[] partes = nome.split(" ");

		// Pega o primeiro nome (prenome)
		String primeiroNome = partes[0];

		// Verifica se o prenome é "JOSE"
		if (primeiroNome.equalsIgnoreCase("JOSE")) {
			System.out.println("Nome: " + nome);
		} else {
			System.out.println("O prenome não é JOSE.");
		}

		sc.close();
	}
}
