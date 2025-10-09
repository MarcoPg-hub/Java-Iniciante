package ListaFor;

import java.util.Scanner;

public class NumMultiplos {

	public static void main(String args[]) {

		/*
		 * Alg 202: criar um algoritmo que leia um número (num) da entrada e imprima os
		 * múltiplos de 3 e 5 ao mesmo tempo no intervalo de 1 a num. Número lido: 50
		 * Saída: 15 30 45
		 */

		Scanner sc = new Scanner(System.in);
		
		  System.out.print("Digite um número para iniciar o programa: ");
	        int num = sc.nextInt();

	        int multiploDeTres = 0;
	        int multiploDeCinco = 0;

	        System.out.print("Múltiplos de 3: ");
	        for (int i = 1; i < num; i++) {
	            if (i % 3 == 0) {
	                System.out.print(i + " ");
	                multiploDeTres += i;
	            }
	        }

	        System.out.print("\nMúltiplos de 5: ");
	        for (int i = 1; i < num; i++) {
	            if (i % 5 == 0) {
	                System.out.print(i + " ");
	                multiploDeCinco += i;
	            }
	        }

	        System.out.println("\n\nSoma dos múltiplos de 3: " + multiploDeTres);
	        System.out.println("Soma dos múltiplos de 5: " + multiploDeCinco);

	        sc.close();
	    }
	}
