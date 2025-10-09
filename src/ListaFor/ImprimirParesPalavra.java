package ListaFor;

import java.util.Scanner;

public class ImprimirParesPalavra {
	public static void main(String args[]) {
		/*
		 * Alg 229: entrar com um nome e imprimir as letras que se encontram nas
		 * posições pares.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome para encontrar os pares: ");
		String nome = sc.nextLine();

		for (int i = 0; i < nome.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(nome.charAt(i));
			}

		}

		sc.close();
	}

}
