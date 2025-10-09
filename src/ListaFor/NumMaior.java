package ListaFor;

import java.util.Scanner;

public class NumMaior {
	public static void main(String args[]) {

		/*
		 * Alg 204: criar um algoritmo que leia um número (num) da entrada em seguida,
		 * ler n números inteiros da entrada e imprimir o maior deles. Número lido: 5
		 * Dígitos: 3 12 4 63 50 - maior: 63
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números inteiros você vai digitar? ");
		int n = sc.nextInt();

		int maior = Integer.MIN_VALUE; // começa com o menor valor possível
		int valor;

		for (int i = 1; i <= n; i++) {
			valor = sc.nextInt();
			System.out.print(valor + " ");

			if (valor > maior) {
				maior = valor;

			}

		}

		System.out.println(" - maior :" + maior);
		sc.close();
	}

}
