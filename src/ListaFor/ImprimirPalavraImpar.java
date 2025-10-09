package ListaFor;

import java.util.Scanner;

public class ImprimirPalavraImpar {

	public static void main(String args[]) {

		/*
		 * Alg 249: criar um algoritmo que entre com uma palavra se a palavra tiver
		 * número impar de caracteres imprima conforme exemplo a seguir, caso contrário
		 * imprima: NÃO FACO Palavra: SONHO Saída: SONHO SONHO SONHO SONHO SONHO SONHO
		 * SONHO SONHO SONHO
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra para imprimir apenas os números ímpares:");
		String palavra = sc.nextLine();

		if (palavra.length() % 2 != 0) {

			for (int i = 1; i <= palavra.length(); i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= i; j++) {
						System.out.print(palavra + " ");
					}
				}
				System.out.println();

			}
		} else {
			System.out.println("NÃO FAÇO");
		}

		sc.close();
	}

}
