package ListaFor;

import java.util.Scanner;

public class SerieNN {
	public static void main(String[] args) {
		/*
		 * Alg 238: ler o número de termos da série (n) e imprimir o valor de H
		 * sendo que: H = n + (n-1)/n + (n-2)/(n-1) + ... + 1/2
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de termos da série (n): ");
		int n = sc.nextInt();

		double H = 0;

		for (int i = n; i >= 2; i--) {
			H += (double) i / (i - 1);
		}

		System.out.printf("O valor de H para n = %d é: %.4f%n", n, H);

		sc.close();
	}
}