package listaIfElse;

import java.util.Scanner;

public class DivisivelPorTresSete {

	public static void main(String args[]) {

		// Alg 96: entrar com um número e informar se ele é divisível por 3 e por 7

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para verificar se é divisível por 3 e 7: ");

		int num = sc.nextInt();

		if (num % 3 == 0 && num % 7 == 0) {
			System.out.println(num + " é divisivel por 3 e por 7");
		} else {
			System.out.println(num + " não é divisível por 3 e por 7");
		}

		sc.close();
	}

}
