package ListaFor;

import java.util.Scanner;

public class ParesImpressos {
	public static void main(String args[]) {
		/*
		 * Alg 193: criar um algoritmo que leia um número que servirá para controlar os
		 * números pares que são impressos a partir de 2. Exemplo: Quantos: 4 Saída: 2 4
		 * 6 8
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número : ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.printf((2 * i) + " ");

		}

		sc.close();
	}

}
