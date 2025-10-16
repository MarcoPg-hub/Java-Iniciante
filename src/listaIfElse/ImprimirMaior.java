package listaIfElse;

import java.util.Scanner;

public class ImprimirMaior {

	public static void main(String args[]) {

		// Alg 111: entrar com dois números e imprimir o maior número

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("O maior número é: " + num1);
		} else if (num2 > num1) {
			System.out.println("O maior número é: " + num2);
		} else {
			System.out.println("Os dois números são iguais.");
		}

		sc.close();
	}
}
