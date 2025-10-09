package ListaFor;

import java.util.Scanner;

public class ImpressaoPalavraContrario {
	public static void main(String args[]) {
		/*
		 * Alg 225: criar um algoritmo que entre com uma palavra e imprima conforme o
		 * exemplo a seguir: Palavra: TERRA Saída: A RA RRA ERRA TERRA
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra para impressão; ");
		String nome = sc.nextLine();
		
		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.println(nome.substring(i));
		}
		
		sc.close();
	}

}
