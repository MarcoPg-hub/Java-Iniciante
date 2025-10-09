package ListaFor;

import java.util.Scanner;

public class ImprimirQuantidadeNomes {
	public static void main(String args[]) {
		/*
		 * Alg 220: entrar com um nome e imprimí-lo tantas vezes quantos forem seus
		 * caracters. Nome: Ricardo Saída: Ricardo – Ricardo – Ricardo – Ricardo –
		 * Ricardo – Ricardo - Ricardo
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome para começar a impressão: ");
		String nome = sc.nextLine();
		
		for(int i = 1 ; i <= nome.length() ; i++) {
			System.out.print(nome + " - ");
		}
		
		sc.close();
	}

}
