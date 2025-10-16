package listaIfElse;

import java.util.Scanner;

public class DivisivelPorDezCincoDois {

	public static void main(String args[]) {

		/*
		 * Alg 97: entrar com um número e informar se ele é divisível por 10, por 5, por
		 * 2 ou se não é divisível por nenhum destes
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para verificar se o mesmo é divisivel pelos seguintes números:\n"
				+ "----- 10 , 5 , 2 -----\n");
		int num = sc.nextInt();

		System.out.println("========INICIANDO========");

		if (num % 10 == 0) {
			System.out.println(num + " é divisivel por 10.");
		} else if (num % 5 == 0) {
			System.out.println(num + " é divisivel por 5.");
		} else if (num % 2 == 0) {
			System.out.println(num + " é divisivel por 2.");
		} else {
			System.out.println(num + " não é divisivel por 10 , 5 ou 2.");
		}
		System.out.println(">>>>>>>>RESULTADO<<<<<<<<");

		sc.close();
	}

}
