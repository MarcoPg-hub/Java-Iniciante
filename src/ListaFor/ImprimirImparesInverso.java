package ListaFor;

import java.util.Scanner;

public class ImprimirImparesInverso {

	public static void main(String args[]) {

		/*
		 * Alg 230: entrar com um nome e imprimir as letras que se encontram nas
		 * posições impares de trás para frente.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome para imprimir os impares ao contrario: ");
		String nome = sc.nextLine();

		for (int i = nome.length() -1; i >= 0; i--) {
			if (i % 2 != 0) {
				System.out.print(nome.charAt(i));
			}
		}

		sc.close();
	}

}
