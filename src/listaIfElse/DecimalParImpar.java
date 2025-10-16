package listaIfElse;

import java.util.Scanner;

public class DecimalParImpar {

	public static void main(String args[]) {

		/*
		 * Alg 99: ler um número inteiro de 3 casas decimais e imprimir se o algarismo
		 * de casa das centenas é par ou impar
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero com 3 casas decimais:");
		
		int num = sc.nextInt();
		
		int centena = num / 100;
		
		if(centena % 2 == 0) {
			System.out.println("É par.");
		}else {
			System.out.println("É impar.");
		}
		
		sc.close();

	}

}
