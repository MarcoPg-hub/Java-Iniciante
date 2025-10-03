package introducaoJava;

import java.util.Scanner;

public class NovoPeso {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leita o peso de uma pessoa, só a parte inteira,
		 * calcular e imprimir: O peso da pessoa em gramas .Novo peso, em gramas, se a
		 * pessoa engordar 12%
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o peso da pessoa : ");

		double peso = sc.nextDouble();
		int pesoInteiro = (int) peso;
		double porcentagemGordura = 12.0 / 100.0;
		double pesoGramas = pesoInteiro * 1000.0;
		double pesoGramasEngordar = pesoGramas * porcentagemGordura + pesoGramas;

		System.out.println("O peso da pessoa em gramas é de " + pesoGramas);
		System.out.println("O novo peso da pessoa após engordar 12% é de " + pesoGramasEngordar);
		sc.close();
	}

}
