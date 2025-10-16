package listaIfElse;

import java.util.Scanner;

public class QuadradoRaiz {

	public static void main(String args[]) {

		/*
		 * Alg 115: criar um algoritmo que deixe entrar com dois números e imprimir o
		 * quadrado do menor e a raiz quadrada do maior número
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");

		double num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");

		double num2 = sc.nextInt();
		double quadrado;
		double raiz;
		
		if(num1 > num2) {
			quadrado = Math.pow(num2, 2);
			System.out.println("O quadrado de " + num2+ " é : " + (int)quadrado);
		}else if(num1 < num2) {
			raiz = Math.sqrt(num2);
			System.out.printf("A raiz de %.0f é %.2f." , num2 , raiz);
			//System.out.println("A raiz de " + num2 + " é : " + raiz);
		}else {
			System.out.println("Número inválido");
		}

		sc.close();
	}

}
