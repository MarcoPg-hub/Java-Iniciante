package introducaoJava;

import java.util.Scanner;

public class Alg79 {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leia a quantidade de fitas qe uma locadora de vídeo
		 * possui e o valor que ela cobra por cada aluguel, mostrando as informações
		 * pedidas a seguir o Sabendo que um terço das fitas alugadas por mês, exiba o
		 * faturamento anual da locadora o Quando o cliente atrasa a entrega, é cobrada
		 * uma multa de 10% sobre o valor do aluguel. Sabendo que o décimo das fitas
		 * alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas
		 * por mês o Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um
		 * décimo do total é comprado para reposição, exiba a quantidade de fitas que a
		 * locadora terá no final do ano.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas fitas a locadora possui ?");
		int fitas = sc.nextInt();
		System.out.println("Qual o valor de aluguel para cada fita ?");
		double aluguelFita = sc.nextDouble();
		double aluguelMes = fitas / 3.0;
		double valorFitasAnual = (aluguelMes * aluguelFita) * 12; // faturamento anual fitas
		double atraso = 10.0 / 100.0;
		double calculoAtraso = (atraso * aluguelFita) * 12; // calculo de 10% sobre o valor do aluguel em atraso
		double fitasDevolvidas = (1.0 / 10.0) * aluguelMes;
		double valorGanhoMultas = fitasDevolvidas * calculoAtraso;
		double estragoFita = (2.0 / 100.0) * fitas; // 2% ano
		double reposicao = fitas * (1.0 / 10.0);
		double estoqueTotal = fitas + reposicao - estragoFita;

		System.out.printf("O faturamento anual da locadora é de R$ %.2f reais.%n", valorFitasAnual);
		System.out.printf("O valor ganho com multas por mês é de R$ %.2f reais.%n", valorGanhoMultas);
		System.out.println("O estoque total no final do ano da locadora é de : " + (int)estoqueTotal + " unidades");

		sc.close();
	}

}
