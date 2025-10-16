package listaIfElse;

import java.util.Scanner;

public class ResultadoDeX {

	public static void main(String[] args) {

		/*
		 * Alg 159: criar um algoritmo que entre com o valor de x, calcule e imprima o
		 * valor de f(x) f(x) = 5x +3/ raiz(x^2-16)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Alg 159: Calcular f(x) = (5x + 3) / sqrt(x^2 - 16)");
		System.out.print("Digite o valor de x: ");
		double x = sc.nextDouble();

		double dentroRaiz = x * x - 16;

		if (dentroRaiz <= 0) {
			System.out.println("Erro: expressão dentro da raiz deve ser maior que zero (x < -4 ou x > 4).");
		} else {
			double fx = (5 * x + 3) / Math.sqrt(dentroRaiz);
			System.out.println("f(x) = " + fx);
		}

		sc.close();
	}
}
