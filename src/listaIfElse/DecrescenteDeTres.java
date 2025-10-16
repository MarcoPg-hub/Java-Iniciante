package listaIfElse;

import java.util.Scanner;

public class DecrescenteDeTres {

	public static void main(String args[]) {

		// Alg 119: entrar com três números e imprimi-lo em ordem decrescente

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		int menor = 0, meio = 0, maior = 0;

		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
			if (num2 >= num3) {
				meio = num2;
				menor = num3;
			} else {
				meio = num3;
				menor = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
			if (num1 >= num3) {
				meio = num1;
				menor = num3;
			} else {
				meio = num3;
				menor = num1;
			}
		} else {
			maior = num3;
			if (num1 >= num2) {
				meio = num1;
				menor = num2;
			} else {
				meio = num2;
				menor = num1;
			}
		}

		System.out.printf("A ordem decrescente dos números é %d , %d , %d", maior, meio, menor);

		sc.close();
	}

}
