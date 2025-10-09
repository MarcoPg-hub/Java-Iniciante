package ListaFor;

import java.util.Scanner;

public class NumeroProduto {
	public static void main(String args[]) {
		/*
		 * Alg 194: criar um algoritmo que leia um número e imprima todos os números de
		 * 1 até o número lido e o seu produto. Exemplo: número: 3 Saída: 1 2 3 -
		 * Produto: 6
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para imprimir a contagemd e ímpares:");
		int num = sc.nextInt();
		int produto = 1;

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			produto *= i;
		}

		System.out.println(" Produto : " + produto);

		sc.close();
	}

}
