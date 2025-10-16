package listaIfElse;

import java.util.Scanner;

public class LendoNumeros {

	public static void main(String args[]) {

		/*
		 * Alg 110: criar um algoritmo que leia dois números e imprimir uma mensagem
		 * dizendo se são iguais ou diferentes
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");

		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");

		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Os números " + num1 + " - " + num2 + " são iguais.");
		} else {
			System.out.println("Os números " + num1 + " - " + num2 + " são diferentes.");
		}

		sc.close();
	}

}
