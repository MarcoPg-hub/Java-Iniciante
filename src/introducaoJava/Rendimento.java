package introducaoJava;

import java.util.Scanner;

public class Rendimento {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leia o valor de um depósito e o valor da taxa de
		 * juros. Calcular e imprimir o valor do rendimento e o valor total depois do
		 * rendimento.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do depósito : ");
		double deposito = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros : ");
		double taxa = sc.nextDouble();
		double taxaCalculada = taxa / 1000.0;
		double rendimento = deposito * taxaCalculada;
		double rendimentoFinal = deposito*taxaCalculada + deposito;
		
		System.out.printf("Valor do rendimento R$ %.2f%n"
				+ "Valor total com rendimento R$ %.2f" , rendimento , rendimentoFinal);
		sc.close();
	}

}
