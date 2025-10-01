package introducaoJava;

import java.util.Scanner;

public class Alg71 {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leia o numerador e o denominador de uma fração e
		 * transformá-lo em um número decimal.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para o numerador");
		
		double numerador = sc.nextDouble();
		
		System.out.println("Digite o valor para o denominador");
		
		double denominador = sc.nextDouble();
		
		double decimal = numerador / denominador;
		
		System.out.printf("O resultado entre o numerador %.0f e o denominador %.0f é de %.2f." , numerador  , denominador , decimal);
		sc.close();
	}

}
