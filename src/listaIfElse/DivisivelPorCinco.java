package listaIfElse;

import java.util.Scanner;

public class DivisivelPorCinco {

	public static void main(String args[]) {

		/* Alg 95: entrar com um número e informar se ele é ou não divisível por 5 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para verificarmos se o mesmo é divisivel por 5: ");
		int num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println(num + "Divisivel por 5.");
		} else {
			System.out.println(num + "Não é divisivel por 5.");
		}

		sc.close();
	}

}
