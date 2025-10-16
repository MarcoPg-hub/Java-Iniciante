package listaIfElse;

import java.util.Scanner;

public class CrescenteDeTres {

	public static void main(String args[]) {

		// Alg 118: entrar com três números e imprimi-lo em ordem crescente

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		int menor, maior = 0, meio = 0;

		if (num1 <= num2 && num1 <= num3) {
			menor = num1;
			if (num2 <= num3) {
				meio = num2;
				maior = num3;
			}
		} else if (num2 <= num1 && num2 <= num3) {
			menor = num2;
			if (num1 <= num3) {
				meio = num1;
				maior = num3;
			} else {
				meio = num3;
				maior = num1;
			}
		} else {
			menor = num3;
			if (num1 <= num2) {
				meio = num1;
				maior = num2;
			} else {
				meio = num2;
				maior = num1;
			}
		}
		System.out.printf("Ordem crescente : %d , %d , %d%n" , menor , meio , maior);
		sc.close();
	}

}
