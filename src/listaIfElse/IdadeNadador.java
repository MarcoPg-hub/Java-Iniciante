package listaIfElse;

import java.util.Scanner;

public class IdadeNadador {

	public static void main(String args[]) {

		/*
		 * Alg 134: a confederação brasileira de natação irá promover eliminatórias para
		 * o próximo mundial. Fazer um algoritmo que receba a idade de um nadador e
		 * imprimir a sua categoria segundo a tabela a seguir: Categoria Infantil A
		 * Idade 5 – 7 anos Infantil B 8 – 10 anos Juvenil A 11 – 13 anos Juvenil B 14 –
		 * 17 anos Sênior Mais que 18 anos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do nadador: ");
		int idade = sc.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil.");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Juvenil A.");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Juvenil B.");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Sênior");
		} else {
			System.out.println("Mais que 18 anos.");
		}

		sc.close();
	}

}
