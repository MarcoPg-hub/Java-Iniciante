package ListaFor;

import java.util.Scanner;

public class SequenciaImprimir {
	public static void main(String args[]) {

		/*
		 * Alg 248: criar um algoritmo que entre com uma palavra e imprima conforme
		 * exemplo a seguir: Palavra: SONHO Saída: SONHO SONHO SONHO SONHO SONHO SONHO
		 * SONHO SONHO SONHO SONHO SONHO SONHO SONHO SONHO SONHO
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra para impressão na tela: ");

		String palavra = sc.nextLine();

		for (int i = 1; i <= palavra.length(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(palavra + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
