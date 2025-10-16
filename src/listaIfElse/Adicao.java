package listaIfElse;

import java.util.Scanner;

public class Adicao {

	public static void main(String args[]) {

		/*
		 * Alg 92: contruir um algoritmo que leia dois números e efetue a adição. Caso o
		 * valor somado seja maior que 20, este deverá ser apresentado somando-se ele
		 * mais 8; caso o valor seja menor ou igual a 20, este deverá ser apresentado
		 * subtraindo-se 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Adição de dois inteiros===\n");
		System.out.println("-----------------------------\n");
		
		System.out.println("Digite o primeiro inteiro para adição:");
		
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo inteiro para adição:");
		
		int num2 = sc.nextInt();
		
		int adicao = num1 + num2;
		
		if(adicao > 20) {
			System.out.println("Resultado do digito maior que 20 : " + (adicao + 8));
		}else {
			System.out.println("Resultado menor do que 20 : " + (adicao - 5));
		}
		
		
		sc.close();
	}

}
