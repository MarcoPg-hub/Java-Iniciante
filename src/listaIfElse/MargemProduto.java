package listaIfElse;

import java.util.Scanner;

public class MargemProduto {

	public static void main(String args[]) {

		/*
		 * um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o
		 * valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%.
		 * Entrar com o valor do produto e imprimir o valor da venda
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do produto para venda: ");
		double valorProduto = sc.nextDouble();
		double lucro = 0;
		double valorFinal = 0;

		if (valorProduto < 20) {
			lucro = valorProduto * 0.45;
			valorFinal = valorProduto + lucro;
			System.out.printf("Valor produto R$%.2f%nLucro R$%.2f%nValor final R$%.2f", valorProduto, lucro,
					valorFinal);
		} else {
			lucro = valorProduto * 0.30;
			valorFinal = valorProduto + lucro;
			System.out.printf("Valor produto R$%.2f%nLucro R$%.2f%nValor final R$%.2f", valorProduto, lucro,
					valorFinal);
		}

		sc.close();
	}

}
