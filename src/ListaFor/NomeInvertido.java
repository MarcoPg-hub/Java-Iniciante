package ListaFor;

import java.util.Scanner;

public class NomeInvertido {
	public static void main(String args[]) {
		/*
		 * Alg 222: criar um algoritmo que entre com uma palavra e imprima o inverso da
		 * palavra: Palavra: PAZ Saída: ZAP
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome para imprimir o inverso da mesma : ");
		String nome = sc.nextLine();

		for (int i = nome.length() -1; i >= 0 ; i--) {
			System.out.print(nome.charAt(i));
		}
		sc.close();

	}

}
