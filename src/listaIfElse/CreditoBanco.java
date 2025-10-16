package listaIfElse;

import java.util.Scanner;

public class CreditoBanco {

	public static void main(String args[]) {

		/*
		 * Alg 144: o banco xxx concederá um crédito especial com juros de 2% aos seus
		 * clientes de acordo com o saldo médio no último ano. Fazer um algoritmo que
		 * leia o saldo médio de um cliente de acordo com a tabela a seguir. Imprimir
		 * uma mensagem informando o saldo médio e o valor do crédito. Saldo médio
		 * Percentual De 0 a 500 Nenhum crédito De 501 a 1000 30% De 1001 a 3000 40%
		 * Acima de 3001 50%
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o saldo médio do cliente: ");
		double saldo = sc.nextDouble();
		double credito;

		System.out.printf("%nSaldo médio : %.2f reias.%n", saldo);

		if (saldo >= 0 && saldo <= 500) {
			System.out.println("Nenhum crédito");
		} else if (saldo >= 501 && saldo <= 1000) {
			credito = saldo * 0.30;
			System.out.printf("Crédito especial : R$%.2f reais.%n", credito);
		} else if (saldo >= 1001 && saldo <= 3000) {
			credito = saldo * 0.40;
			System.out.printf("Crédito especial : R$%.2f reais.%n", credito);
		} else {
			credito = saldo * 0.50;
			System.out.printf("Crédito especial : R$%.2f reais.%n", credito);
		}

		sc.close();
	}

}
