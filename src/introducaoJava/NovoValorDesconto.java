package introducaoJava;

import java.util.Scanner;

public class NovoValorDesconto {

	public static void main(String args[]) {

		/*
		 * Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
		 * vendas oferecendo desconto. Faça um algoritmo que possa entrar com o valor de
		 * um produto e imprima o novo valor tendo em vista que o desconto foi de 9%.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o valor do produto : ");

		double valorProduto = sc.nextDouble();

		System.out.printf("Digite o valor de desconto do produto: ");

		double descontoProduto = sc.nextDouble();

		double calculoDesconto = valorProduto * (descontoProduto / 100);

		double valorProdutoFinal = valorProduto - calculoDesconto;

		System.out.println("O valor final do produto com o desconto de " + descontoProduto + "% é de R$ "
				+ valorProdutoFinal + " reais");

		sc.close();
	}

}
