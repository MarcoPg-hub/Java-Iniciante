package ListaFor;

import java.util.Scanner;

public class ImprimirPalavraVertical {
	public static void main(String args[]) {
		/*
		 * Alg 221: criar um algoritmo entre com uma palavra e imprimir conforme o
		 * exemplo a seguir: Palavra: PAZ Saída: P A Z
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra para a impressão: ");
		String nome = sc.nextLine();
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		sc.close();
	}
}
