package introducaoJava;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String args[]) {

		/*
		 * Para vários tributos, a base de cálculo é o salário mínimo. Fazer um
		 * algoritmo que leia o valor do salário mínimo e o valor do salário de uma
		 * pessoa. Calcular e imprimir quantos salários mínimos ela ganharia.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o valor do salário mínimo atual R$ ");

		double salarioMinimo = sc.nextDouble();

		System.out.printf("Dgite o valor do salário de uma Pessoa para o cálculo : ");

		double salarioPessoa = sc.nextDouble();

		double calculoSalarioMinimo = (int) (salarioPessoa / salarioMinimo); // fazendo um cast para forçar o
																				// arredondamento do salario

		System.out.println("A pessoa ganharia " + (int)calculoSalarioMinimo + " salários mínimos.");

		sc.close();
	}

}
