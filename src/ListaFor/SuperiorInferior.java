package ListaFor;

import java.util.Scanner;

public class SuperiorInferior {
	public static void main(String args[]) {

		/*
		 * Alg 198: criar um algoritmo que leia os limites inferior e superior de um
		 * intervalo e imprima todos os números naturais no intervalo fechado. Suponha
		 * que os dados digitados são para um intervalo crescente. Limite inferior: 5
		 * Limite superior: 12 Saída: 5 6 7 8 9 10 11 12
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número superior:");
		
		int superior = sc.nextInt();
		
		System.out.println("Digite o número inferior:");
		
		int inferior = sc.nextInt();
		
		for(int i = inferior ; i <= superior ; i++) {
			System.out.printf(i + " ");
		}
		
		sc.close();
	}

}
