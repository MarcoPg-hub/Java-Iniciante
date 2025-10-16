package listaIfElse;

import java.util.Scanner;

public class ValorVenda {

	public static void main(String[] args) {

		/*
		 * Alg 149: um comerciante calcula o valor da venda, tendo em vista a tabela a
		 * seguir. Criar um algoritmo que possa entrar com nome do produto e valor da
		 * compra e imprimir o nome do produto e o valor da venda. Valor da compra Valor
		 * < R$ 10,00 Valor da venda Lucro de 70% R$ 10,00 ≤ valor < R$ 30,00 lucro de
		 * 50% R$ 30,00 ≤ valor < R$ 50,00 lucro de 40% valor ≥ R$ 50,00 lucro de 30%
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String produto = sc.nextLine();

		System.out.print("Digite o valor da compra (R$): ");
		double valorCompra = sc.nextDouble();

		double valorVenda = 0;

		if (valorCompra < 10) {
			valorVenda = valorCompra * 1.7;
		} else if (valorCompra >= 10 && valorCompra < 30) {
			valorVenda = valorCompra * 1.5;
		} else if (valorCompra >= 30 && valorCompra < 50) {
			valorVenda = valorCompra * 1.4;
		} else {
			valorVenda = valorCompra * 1.3;
		}

		// Exibe resultado
		System.out.printf("Produto: %s%n", produto);
		System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);

		sc.close();
	}
}