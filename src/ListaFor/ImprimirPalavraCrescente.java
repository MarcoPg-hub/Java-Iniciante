package ListaFor;

import java.util.Scanner;

public class ImprimirPalavraCrescente {
	public static void main(String args[]) {
		/*
		 * Alg 223: criar um algoritmo que entre com uma palavra e imprima conforme o
		 * exemplo a seguir: Palavra: AMOR Saída: A AM AMO AMOR
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra para começar a impressão; ");
		String nome = sc.nextLine();

		for (int i = 0; i <= nome.length(); i++) {
			System.out.println(nome.substring(0, i));
			/*
			 * O método substring(0, i) pega os primeiros i caracteres da palavra. No
			 * primeiro laço: i = 1 → A Depois: i = 2 → AM, e assim por diante até formar a
			 * palavra completa.
			 */
		}

		sc.close();
	}

}
