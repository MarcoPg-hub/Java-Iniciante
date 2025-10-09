package ListaFor;

import java.util.Scanner;

public class NumTriplo {

	public static void main(String args[]) {

		/*
		 * Alg 203: criar um algoritmo que leia um número (num) da entrada em seguida,
		 * ler n números da entrada e imprimir o triplo de cada um. Número lido: 5
		 * Dígitos: 3 triplo: 9 10 triplo: 30 12 triplo: 36 2 triplo: 6 1 triplo: 3
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número para inicar a contagem : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int valor = sc.nextInt();
			int triplo = valor * 3;
			System.out.println(valor + "      triplo: " + triplo);
		}

		sc.close();

	}

}
