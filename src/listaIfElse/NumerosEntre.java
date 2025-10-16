package listaIfElse;

import java.util.Scanner;

public class NumerosEntre {

	public static void main(String args[]) {

		/*
		 * Alg 101: construir um algoritmo que indique se o número digitado está
		 * compreendido entre 20 e 90 ou não.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para verificar se está entre 20 e 90 :");

		int num = sc.nextInt();

		if (num > 21 && num < 90) {
			System.out.println("Número: " + num + " - O número esta dentre 20 e 90.");
		} else {
			System.out.println("Número: " + num + " O número não está dentre 20 e 90.");
		}

		sc.close();
	}

}
