package listaIfElse;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String args[]) {

		/*
		 * Alg 137: ler três valores inteiros (variáveis a, b, e c) e efetuar o cálculo
		 * da equação de segundo grau, apresentando: as duas raizes, se para os valores
		 * informados for possível fazer o cálculo (delta positivo ou zero); a mensagem
		 * “Não há raízes reais”, se não for possível fazer o cálculo (delta negativo);
		 * e a mensagem “Não é equação do segundo grau”, se o valor de a for igual a
		 * zero detalhes formula matematica : Se 𝑎 = 0 a=0 → não é equação do segundo
		 * grau. Se Δ < 0 Δ<0 → não há raízes reais. Se Δ = 0 Δ=0 → há uma única raiz
		 * real (as duas são iguais). Se Δ > 0 Δ>0 → há duas raízes reais distintas.
		 * ax^2+bx+c=0 Δ=b2−4ac x1 ​= −b+ raiz(Δ)/2*a x2 ​= −b- raiz(Δ)/2*a
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números inteiros para fazermos o cálculo da equação de segundo grau: ");
		System.out.println("Digite o valor para A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor para B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor para C: ");
		int c = sc.nextInt();

		double delta = Math.pow(b, 2) - 4 * a * c;

		double x1 = 0;
		double x2 = 0;

		if (a == 0) {
			System.out.println("Não é equação de segundo grau.");
		} else if (delta < 0) {
			System.out.println("Não há raízes reais.");
		} else if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("%nPrimeira raiz x1 = %.2f%nSegunda raiz x2 = %.2f%n", x1, x2);
		}

		sc.close();
	}

}
