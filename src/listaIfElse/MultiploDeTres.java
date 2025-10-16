package listaIfElse;

import java.util.Scanner;

public class MultiploDeTres {

	public static void main(String args[]) {

		/*
		 * Alg 94: entrar com um número e imprimir uma das mensagens: é multiplo de 3 ou
		 * não é multiplo de 3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para iniciar o programa:");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("É multiplo de 3.");
		}else{
			System.out.println("Não é multiplo de 3.");
		}
		sc.close();
	}

}
