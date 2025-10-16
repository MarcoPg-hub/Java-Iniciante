package listaIfElse;

import java.util.Scanner;

public class AnguloTriangulo {

	public static void main(String args[]) {

		/*
		 * Alg 124: ler três números, os possíveis lados de um triângulo, e imprimir a
		 * classificação segundo ângulos formulas : retangulo a^2 + b^2 = c^2 ocutangulo
		 * a^2 + b^2 > c^2 obtusangulo a^2 + b^2 < c^2 primeiro passo sempre achar o
		 * maior lado sempre fica oposto ao maior ângulo no caso a soma dos catetos é
		 * igual a hipotenusa
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro lado: ");
		double a = sc.nextInt();

		System.out.println("Digite o segundo lado: ");
		double b = sc.nextInt();

		System.out.println("Digite o terceiro lado: ");
		double c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {

			double maior = 1; // aqui ja estamos iniciando a busca do maior lado
			double lado1 = b, lado2 = c;

			if (b > maior) {
				maior = b;
				lado1 = a;
				lado2 = c;
			}
			if (c > maior) {
				maior = c;
				lado1 = a;
				lado2 = b;
			}
			double somaDosQuadrados = lado1 * lado1 + lado2 * lado2; // soma dos catetos
			double quadradoMaior = maior * maior; // hipotenusa

			// agora vamos aplicar a regra dos angulos para retanuglo , ocutangulo e
			// obtusangulo

			if (somaDosQuadrados == quadradoMaior) {
				System.out.println("Triângulo retângulo.");
			} else if (somaDosQuadrados > quadradoMaior) {
				System.out.println("Triângulo ocutângulo.");
			} else {
				System.out.println("Triângulo obtusângulo.");
			}
		}
		sc.close();
	}

}
