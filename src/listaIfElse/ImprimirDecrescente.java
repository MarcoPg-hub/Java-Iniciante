package listaIfElse;

import java.util.Scanner;

public class ImprimirDecrescente {

	public static void main(String args[]) {

		// Alg 114: entrar com dois números e imprimi-los em ordem decrescente

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println(num2 + "\n" + num1);
		} else if (num1 > num2) {
			System.out.println(num1 + "\n" + num2);
		} else {
			System.out.println("Números iguais.");
		}

		sc.close();
	}

}
