package introducaoJava;

import java.util.Scanner;

public class SalarioProfessor {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que efetue o cálculo do salário líquido de um professor.
		 * Os dados fornecidos serão: valor da hora aula, número de aulas dadas no mês e
		 * percentual de desconto do INSS.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Cálculo para efetuar o salário líquido do professor");
		System.out.println("Digite o valor da hora/aula : ");

		double valorHoraAula = sc.nextDouble();

		System.out.println("digite o valor de quantas aulas foram lecionadas durante o mês : ");

		int aulasDadas = sc.nextInt();

		System.out.println("Digite o valor percentual de desconto do INSS : ");

		double descontoINSS = sc.nextDouble();
		double salarioBruto = valorHoraAula * aulasDadas;

		double percentualDesconto = salarioBruto * descontoINSS / 100;

		double calculoSalarioLiquido = salarioBruto - percentualDesconto;
		;

		System.out.println("O salário líquido do professor é de R$ : " + calculoSalarioLiquido);

		sc.close();
	}

}
