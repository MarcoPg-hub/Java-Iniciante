package ListaFor;

import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {
		/*
		 * Alg 239: Implementar um algoritmo para calcular o valor de e^x.
		 * O valor de x deverá ser digitado.
		 * O valor de e^x será calculado pela soma dos 10 primeiros termos da série:
		 * e^x = 1 + x/1! + x^2/2! + x^3/3! + ... + x^10/10!
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de x: ");
		double x = sc.nextDouble();

		double e = 1.0; // começa com o primeiro termo (1)
		double numerador = 1.0;
		double denominador = 1.0;

		for (int i = 1; i <= 10; i++) {
			numerador *= x;       // x^i
			denominador *= i;     // i!
			e += numerador / denominador;
		}

		System.out.printf("O valor aproximado de e^%.2f é: %.6f%n", x, e);

		sc.close();
	}
}