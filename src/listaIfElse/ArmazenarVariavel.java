package listaIfElse;

import java.util.Scanner;

public class ArmazenarVariavel {

	public static void main(String args[]) {

		/*
		 * Alg 120: entrar com três números e armazená-los em três variáveis com os
		 * seguintes nomes: maior, intermediario e menor
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		int menor = 0, intermediario = 0, maior = 0;

		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
			if (num2 >= num3) {
				intermediario = num2;
				menor = num3;
			} else {
				intermediario = num3;
				menor = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
			if (num1 >= num3) {
				intermediario = num1;
				menor = num3;
			} else {
				intermediario = num3;
				menor = num1;
			}
		} else {
			maior = num3;
			if (num1 >= num2) {
				intermediario = num1;
				menor = num2;
			} else {
				intermediario = num2;
				menor = num1;
			}
		}

		System.out.printf("Os valores são: \n-Menor : %d%n-Intermediario : %d%n-Maior : %d", menor, intermediario,
				maior);

		sc.close();
	}

}
