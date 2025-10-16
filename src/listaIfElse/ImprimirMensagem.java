package listaIfElse;

import java.util.Scanner;

public class ImprimirMensagem {

	public static void main(String args[]) {

		/*
		 * Alg 104: entrar com nome, sexo e a idade de uma pessoa. Se a pessoa for do
		 * sexo feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA.
		 * Caso contrario, imprimir nome e a mensagem: NÃO ACEITA
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome :");

		String nome = sc.nextLine();
		
		System.out.println("Digite o seu sexo . (M/F) :");

		char sexo = sc.next().charAt(0);
		sexo = Character.toLowerCase(sexo);// considera maiúsculo e minúsculo
		
		System.out.println("Digite sua idade: ");

		int idade = sc.nextInt();

		if (sexo == 'F' && idade < 25) {
			System.out.println("Nome : " + nome + "\nAceita.");
		} else {
			System.out.println("Nome : " + nome + "\nNão aceita.");
		}

		sc.close();
	}

}
