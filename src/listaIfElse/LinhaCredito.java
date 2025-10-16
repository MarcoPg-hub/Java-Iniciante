package listaIfElse;

import java.util.Scanner;

public class LinhaCredito {

	public static void main(String args[]) {

		/*
		 * Alg 98: a prefeitura do Rio de Janeiro abriu uma linha de crédito para os
		 * funcionários estaduais. O valor máximo da prestação não poderá ultrapassar
		 * 30% do salário bruto. Fazer um algoritmo que permita entrar com o salário
		 * bruto e o valor da prestação e informar se o empréstimo pode ou não ser
		 * concedido.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("      Linha de crédito - Prefeitura do Rio de Janeiro.");
		System.out.println("----------------------------------------------------------");

		System.out.println(" - Condição : A Prestação não pode ultrapassar 30% do seu salário bruto.\n");

		System.out.println("Digite o seu salário: ");

		double salario = sc.nextDouble();

		System.out.println("Digite o valor da prestação: ");
		double prestacao = sc.nextDouble();

		double emprestimo = (prestacao * 100) / salario;

		if (emprestimo > 30) {
			System.out.printf("Empréstimo negado , o valor da parcela corresponde a %.2f%% do seu salário.%n" , emprestimo);
		} else {
			System.out.println("Empréstimo concedido.");
		}

		sc.close();
	}

}
