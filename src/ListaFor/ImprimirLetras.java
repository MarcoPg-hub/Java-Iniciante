package ListaFor;

import java.util.Scanner;

public class ImprimirLetras {
	public static void main(String args[]) {

		/*
		 * Alg 243: entrar com uma mensagem e imprimir quantas letras A, E, I, O e U tem
		 * esta mensagem (considerar minúsculas e maiúsculas).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma mensagem : ");

		String mensagem = sc.nextLine();
		int contador = 0;

		for (int i = 0; i < mensagem.length(); i++) {
			char letra = mensagem.charAt(i);
			if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i'
					|| letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
				contador++;
			}
		}
		System.out.println("Total de vogais: " + contador);
		
		sc.close();
	}

}
