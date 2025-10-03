package introducaoJava;

import java.util.Scanner;

public class ValorTotal {

	public static void main(String args[]) {

		/*
		 * Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra
		 * 10% para o garçom. Fazer um algoritmo que leia o valor gasto com despesas
		 * realizadas em um restaurante e imprima o valor total com a gorjeta.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor gasto com as despesas no restaurante : ");

		double despesasGastas = sc.nextDouble();
		double taxa = 10.0 / 100.0;
		double gorjetaGarcom = taxa * despesasGastas;
		double gastoTotal = despesasGastas + gorjetaGarcom;

		System.out.printf("O valor gasto com a gorgeta do garçom é de  R$ %.2f  ", gastoTotal);

		sc.close();
	}

}
