package listaIfElse;

import java.util.Scanner;

public class NomeOrdem {

	public static void main(String args[]) {
		
		//Alg 109: criar um algoritmo que entre com dois nomes e imprimi-los em ordem alfabética 

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro nome: ");
		String nome1 = sc.nextLine();

		System.out.print("Digite o segundo nome: ");
		String nome2 = sc.nextLine();

		System.out.println("\nNomes em ordem alfabética:");

		// compara os nomes ignorando maiúsculas/minúsculas
		if (nome1.compareToIgnoreCase(nome2) < 0) {
			System.out.println(nome1);
			System.out.println(nome2);
		} else {
			System.out.println(nome2);
			System.out.println(nome1);
		}

		sc.close();
	}
}
