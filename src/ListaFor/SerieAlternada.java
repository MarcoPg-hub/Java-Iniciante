package ListaFor;

import java.util.Scanner;

public class SerieAlternada {
	public static void main(String[] args) {

		/*
		 * Alg 237: ler o número de termos da série (n) e imprimir o valor de H,
		 * sendo que: H = 1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de termos da série (n): ");
		int n = sc.nextInt();

		double H = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) { // se o termo for par, subtrai
				H -= 1.0 / i;
			} else { // se o termo for ímpar, soma
				H += 1.0 / i;
			}
		}

		System.out.printf("O valor de H para n = %d é: %.4f%n", n, H);

		sc.close();
	}
}