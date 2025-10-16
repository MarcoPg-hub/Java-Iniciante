package listaIfElse;

import java.util.Scanner;

public class SalarioInss {

	public static void main(String args[]) {

		/*
		 * Alg 129: entrar com o salário de uma pessoa e imprimir o valor do desconto
		 * do INSS (em R$), segundo a tabela:
		 * 
		 * Salário até R$ 600,00 → isento
		 * De R$ 600,01 até R$ 1200,00 → 20%
		 * De R$ 1200,01 até R$ 2000,00 → 25%
		 * Acima de R$ 2000,00 → 30%
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário da pessoa: R$ ");
		double salario = sc.nextDouble();

		double salarioFinal;

		if (salario > 0 && salario <= 600) {
			System.out.printf("Salário de R$%.2f é isento de desconto.%n", salario);
		} else if (salario > 600 && salario <= 1200) {
			salarioFinal = salario - (salario * 0.20);
			System.out.printf("Salário bruto: R$%.2f%nDesconto INSS: 20%%%nSalário líquido: R$%.2f%n",
					salario, salarioFinal);
		} else if (salario > 1200 && salario <= 2000) {
			salarioFinal = salario - (salario * 0.25);
			System.out.printf("Salário bruto: R$%.2f%nDesconto INSS: 25%%%nSalário líquido: R$%.2f%n",
					salario, salarioFinal);
		} else if (salario > 2000) {
			salarioFinal = salario - (salario * 0.30);
			System.out.printf("Salário bruto: R$%.2f%nDesconto INSS: 30%%%nSalário líquido: R$%.2f%n",
					salario, salarioFinal);
		} else {
			System.out.println("Valor inválido. Digite um salário maior que zero.");
		}

		sc.close();
	}
}
