package ListaFor;

import java.util.Scanner;

public class ImprimirImpares {
	public static void main(String args[]) {
		/*
		 * Alg 192: criar um algoritmo que leia um número que será superior de um
		 * intervalo, e imprimir todos os números impares menores que esse número.
		 * Exemplo: Limite superior: 15 Saída: 1 3 5 7 9 11 13
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número superior : ");
		int superior = sc.nextInt();
		for(int i = 1 ; i < superior ; i++) {
			if(i % 2 != 0 ) {
				System.out.printf(i + " ");
			}
		}
			
		sc.close();
	}

}
