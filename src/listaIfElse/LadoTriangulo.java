package listaIfElse;

import java.util.Scanner;

public class LadoTriangulo {

	public static void main(String args[]) {

		// Alg 122: ler três números e imprimir se eles podem ou não ser lados de um
		// triangulo
		// formula a +b > c && a + c > b && c + b > a

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
			System.out.println("É possível formar um triângulo com esses lados.");
		} else {
			System.out.println("Não é possível formar um triângulo com esses lados.");
		}

		sc.close();
	}

}
