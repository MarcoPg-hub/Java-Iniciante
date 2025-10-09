package ListaFor;

import java.util.Scanner;

public class NomeSexoImpressao {
	public static void main(String args[]) {
		/*
		 * entrar com um nome, idade, sexo de 20 pessoas. Imprimir o nome se a pessoa
		 * for do sexo masculino e tiver mais de que 21 anos.
		 */

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite seu nome completo : ");
			String nome = sc.nextLine();

			System.out.println("Digite sua idade : ");
			int idade = sc.nextInt();
			sc.nextLine(); // limpando o buffer pq começou com line

			System.out.println("Digite o seu sexo (M/F)");
			char sexo = sc.next().charAt(0);
			sc.nextLine(); // limpando o buffer pq começou com line

			if (Character.toUpperCase(sexo) == 'M' && idade >= 21) { // corrige o problema se o usuário digitar uma letra minúscula 
				System.out.println(nome);
			}
		}

		sc.close();

	}

}
