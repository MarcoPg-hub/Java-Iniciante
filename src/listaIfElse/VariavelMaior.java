package listaIfElse;

import java.util.Scanner;

public class VariavelMaior {

	public static void main(String args[]) {

		// Alg 117: entrar com três números e armazenar o maior número na variável de
		// nome maior

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		int maior = 0;

		if (num1 > num2 && num1 > num3) {
			maior = num1;
			System.out.println("O maior número digitado foi: " + maior);
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.println("O maior número digitado foi: " + maior);
		} else {
			maior = num3;
			System.out.println("O maior número digitado foi: " + maior);
		}

		sc.close();
	}

}
