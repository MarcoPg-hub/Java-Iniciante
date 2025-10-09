package ListaFor;

import java.util.Scanner;

public class SenoDeX {
	public static void main(String[] args) {

		/*
		 * Alg 240: Implementar um algoritmo para calcular o seno de x.
		 * O valor de x deverá ser digitado em graus.
		 * O seno será calculado pela soma dos 10 primeiros termos da série:
		 * sen(x) = x - x^3/3! + x^5/5! - x^7/7! + ...
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de x (em graus): ");
		double graus = sc.nextDouble();

		// Converter graus para radianos
		double x = graus * Math.PI / 180.0;

		double seno = 0.0; // valor acumulado da série
		int sinal = 1; // alterna entre +1 e -1

		for (int n = 0; n < 10; n++) {
			int expoente = 2 * n + 1; // 1, 3, 5, 7, ...
			double termo = Math.pow(x, expoente) / fatorial(expoente);
			seno += sinal * termo;
			sinal *= -1; // alterna o sinal (+, -)
		}

		System.out.printf("sen(%.2f°) ≈ %.8f%n", graus, seno);

		sc.close();
	}

	// Método para calcular o fatorial de um número inteiro
	public static double fatorial(int num) {
		double fat = 1.0;
		for (int i = 1; i <= num; i++) {
			fat *= i;
		}
		return fat;
	}
}