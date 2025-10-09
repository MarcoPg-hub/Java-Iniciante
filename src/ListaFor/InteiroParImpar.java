package ListaFor;

import java.util.Scanner;

public class InteiroParImpar {
	public static void main(String args[]) {

	/*
	 * Alg 216: ler 10 números inteiros e imprimir quantos são pares e quantos são
	 * impares.
	 */
		
		Scanner sc = new Scanner(System.in);
		int impar =0;
		int par = 0;
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("Digite o " + i + "º " + "numero: ");
			int num = sc.nextInt();
			if(num % 2 ==0) {
				par++;
			}else {
				impar++;
			}
						
		}
		System.out.println("São " + par + " pares e " + impar+ " números ímpares");
		
		
		
		sc.close();
	}
}
