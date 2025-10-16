package listaIfElse;

import java.util.Scanner;

public class VerificarNumero {

	public static void main(String args[]) {

		/*
		 * Alg 126: ler um número e imprimir se ele é igual a 5, a 200, a 400, se está
		 * no intervalo entre 500 e 1000, inclusive, ou se ele está for dos escopos
		 * anteriores
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		if (num == 5) {
			System.out.println("O número é igual a 5.");
		} else if (num == 200) {
			System.out.println("O número é igual a 200.");
		} else if (num == 400) {
			System.out.println("O número é igual a 400.");
		} else if (num >= 500 && num <= 100) {
			System.out.println("O número " + num + " está entre 200 a 400.");
		} else {
			System.out.println("O número " + num + " está fora dos escopos anteriores.");

		}

		sc.close();
	}

}
