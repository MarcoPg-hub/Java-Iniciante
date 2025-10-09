package ListaFor;

import java.util.Scanner;

public class ExercicioImprimirFor {
	public static void main(String args[]) {
		/*
		 * Alg 227: criar um algoritmo que entre com uma palavra e se a palavra tiver
		 * número impar de caracteres, imprima conforme o exemplo a seguir; caso
		 * contrário imprima: NÃO FACO. Palavra: SONHO Saída: SONHO ONHO N
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra para iniciar o programa: ");
		String palavra = sc.nextLine();

		if (palavra.length() % 2 != 0) {
			for (int i = 0; i <= palavra.length(); i++) {
				System.out.println(palavra.substring(i));
			}
		}else {
			System.out.println("NÃO FAÇO");
		}

		sc.close();
	}

}
