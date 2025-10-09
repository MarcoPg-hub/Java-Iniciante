package ListaFor;

import java.util.Scanner;

public class NomeLetras {
	public static void main(String args[]) {
		/* Alg 217: entrar com 8 nomes e imprimir quantas letras tem cada nome. */
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int quantidadeLetras;
		
		for(int i = 1 ; i <= 8 ; i++) {
			System.out.println("Digite o " + i + "º nome: ");
			nome = sc.nextLine();
			quantidadeLetras = nome.replace(" ", "").length();
			System.out.println("Nome : " + nome + " Quantidade de letras : " + quantidadeLetras );
		}
		sc.close();
	}

}
