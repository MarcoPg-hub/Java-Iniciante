package listaIfElse;

import java.util.Scanner;

public class SiglaEstado {

	public static void main(String args[]) {

		/*
		 * Alg 105: entrar com a sigla do estado de uma pessoa e imprimir umas das
		 * mensagens: o Carioca o Paulista o Mineiro o Outro estado
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sigla do seu estado: ");

		String estado = sc.nextLine();

		if (estado.equalsIgnoreCase("MG")) {
			System.out.println("Mineiro.");
		} else if (estado.equalsIgnoreCase("SP")) {
			System.out.println("Paulista.");
		} else if (estado.equalsIgnoreCase("RJ")) {
			System.out.println("Carioca.");
		} else {
			System.out.println("Outro estado.");
		}

		sc.close();

	}

}
