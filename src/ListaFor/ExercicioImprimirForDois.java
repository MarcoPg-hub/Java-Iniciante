package ListaFor;

import java.util.Scanner;

public class ExercicioImprimirForDois {
	public static void main(String args[]) {
		/*
		 * Alg 228: criar um algoritmo que entre com uma palavra e se a palavra tiver
		 * número impar de caracteres, imprima conforme o exemplo a seguir; caso
		 * contrário imprima: NÃO FACO. Palavra: SONHO Saída: N ONHO SONHO
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra para começar a imprimir: ");
		String palavra = sc.nextLine();

		if (palavra.length() % 2 != 0) {
			for (int i = palavra.length(); i >= 0; i--) {
				System.out.println(palavra.substring(i));
			}
		} else {
			System.out.println("NÃO FAÇO");
		}

		sc.close();
	}

}
