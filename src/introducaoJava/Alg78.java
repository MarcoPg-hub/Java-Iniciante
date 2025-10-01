package introducaoJava;

import java.util.Scanner;

public class Alg78 {

	public static void main(String args[]) {

		/*
		 * Uma pessoa resolveu fazer uma aplicação em uma poupança programada. Para
		 * calcular seu rendimento, ela deverá fornecer o valor constante da aplicação
		 * mensal, a taxa e o número de meses. Sabendo-se que a fórmula usada para esta
		 * cálculo é: valor _ acumulado = P*( 1 + i )^n − 1/i , i = taxa | P = aplicação
		 * mensal | n = número de meses
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da aplicação mensal R$ : ");
		double valorMensal = sc.nextDouble();
		System.out.println("Digite o valor da taxa de juros : ");
		double taxa = sc.nextDouble();
		System.out.println("Digite o número de meses para o cálculo : ");
		int mes = sc.nextInt();
		double calculoTaxa = taxa / 100;

		double valorAcumulado = valorMensal * (Math.pow((1 + calculoTaxa), mes) - 1) / calculoTaxa;

		System.out.printf("O rendimento é de R$ %.2f", valorAcumulado);

		sc.close();
	}

}
