package ListaFor;

import java.util.Scanner;

public class ImprimirNomeDecrescente {
	public static void main(String args[]) {
		/*
		 * Alg 224: criar um algoritmo que entre com uma palavra e imprima conforme o
		 * exemplo a seguir: Palavra: AMOR Saída: AMOR AMO AM O
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra para começar a impressão; ");
		String nome = sc.nextLine();

		for (int i = nome.length(); i > 0; i--) {
			System.out.println(nome.substring(0, i));
			sc.close();
		}

	}
}
