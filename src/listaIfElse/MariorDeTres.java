package listaIfElse;

import java.util.Scanner;

public class MariorDeTres {

	public static void main(String args[]) {

		// Alg 116: entrar com três números i imprimir o maior número

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");

		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");

		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");

		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é : " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é : " + num2);
		} else {
			System.out.println("O maior número é : " + num3);
		}

		sc.close();
	}

}
