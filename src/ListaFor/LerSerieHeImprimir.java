package ListaFor;

import java.util.Scanner;

public class LerSerieHeImprimir {
	
	public static void main(String[] args) {

		/*
		 * Alg 236: ler o número de termos da série (n) e imprimir o valor de H,
		 * sendo que: H = 1 + 1/2 + 1/3 + ... + 1/n
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de termos da série (n): ");
		int n = sc.nextInt();

		double H = 0;

		for (int i = 1; i <= n; i++) {
			H += 1.0 / i; // soma cada termo da série
		}

		System.out.printf("O valor de H para n = %d é: %.4f%n", n, H);

		sc.close();
	}
}

