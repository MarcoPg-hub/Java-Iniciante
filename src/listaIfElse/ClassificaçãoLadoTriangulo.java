package listaIfElse;

import java.util.Scanner;

public class ClassificaçãoLadoTriangulo {

	public static void main(String args[]) {

		/*
		 * Alg 123: ler três números, os possíveis lados de um triângulo, e imprimir a
		 * classificação segundo os lados , equilátero - todos lados iguais isósceles -
		 * dois lados iguais escaleno - todos os lados sao diferentes
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
			if (num1 == num2 && num2 == num3) {
				System.out.println("Triângulo equilátero.");
			} else if (num1 == num2 || num1 == num3 || num2 == num3) {
				System.out.println("Triangulo isósceles.");
			} else {
				System.out.println("Triângulo escaleno.");
			}
		}

		sc.close();
	}

}
