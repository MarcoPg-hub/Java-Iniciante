package ListaFor;

import java.util.Scanner;

public class SalarioRenda {

	public static void main(String args[]) {

		/*
		 * Alg 234: entrar com nome e salário bruto de 10 pessoas. Imprimir nome e valor
		 * da alíquota do imposto de renda. Salario menor que R$ 600,00 - isento Salario
		 * >= R$ 600,00 e < R$ 1500,00 - 10% Salario >= R$ 1500,00 - 15%
		 */

		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o nome da " + i + "ª pessoa: ");
			nome = sc.nextLine();
			System.out.println("Digite o salário:");
			salario = sc.nextDouble();
			sc.nextLine();
			if (salario < 600) {
				System.out.println(nome + " - Isento");
			} else if (salario >= 600 && salario < 1500) {
				System.out.println(nome + " - Alíquota de 10 %");
			} else {
				System.out.println(nome + " - Alíquita de 15%");
			}
		}

		sc.close();
	}

}
