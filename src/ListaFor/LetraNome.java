package ListaFor;

import java.util.Scanner;

public class LetraNome {
	public static void main(String args[]) {
		/* Alg 218: entrar com 12 nomes e imprimir o primeiro caracter de cada nome. */

		Scanner sc = new Scanner(System.in);

		String nome;
		char caracter;

		for (int i = 1; i <= 12; i++) {
			System.out.println("Digite o " + i + "º nome : ");
			nome = sc.nextLine();
			caracter = nome.charAt(0);
			System.out.println(caracter);
		}

		sc.close();
	}

}
