package ListaFor;

import java.util.Scanner;

public class ImprimirDivisores {
	public static void main(String args[]) {
		/* Alg 215: entrar com um número e imprimir todos os seus divisores. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número para imprimir os divisores : ");
		int num = sc.nextInt();

		
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				System.out.println("Divisores : " + i);
			}
		}
		
		sc.close();
	}

}
