package introducaoJava;

import java.util.Scanner;

public class Alg65 {

	public static void main(String args[]) {

		/*
		 * Alg 73: Criar um algoritmo que receba um número real, calcular e imprimi: A
		 * parte inteira do número A parte fracionária do número O número arredondado
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Digite um número real para início la leitura , lembrando que deve conter ao menos 3 casas decimais : ");

		double numeroReal = sc.nextDouble();

		int parteInteira = (int) numeroReal;

		double parteFracionaria = numeroReal - parteInteira;

		System.out.println("Parte inteira : " + parteInteira);
		System.out.println("Número arredondado : " + Math.round(numeroReal));
		System.out.printf("A parte fracionário do número %.3f%n" , parteFracionaria);

		sc.close();
	}

}
