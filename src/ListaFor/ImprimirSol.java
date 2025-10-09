package ListaFor;

import java.util.Scanner;

public class ImprimirSol {
	public static void main(String args[]) {
		/*
		 * Alg 219: entrar com o número de vezes que se deseja imprimir a palavrar SOL e
		 * imprimir.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas vezes deseja imprimir a palavra : ");
		
		int num = sc.nextInt();		
		String palavra;
		
		for(int i = 1 ; i <= num ; i++) {
			palavra = "SOL";
			System.out.print(palavra + " ");
		}
		
		
		sc.close();
	}

}
