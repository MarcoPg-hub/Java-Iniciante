package listaIfElse;

import java.util.Scanner;

public class Soma {
	
	public static void main(String args[]) {
		
		/*Alg 91: contruir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o 
		resultado seja maior que 10, apresentá-lo */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Adição de dois inteiros===\n");
		System.out.println("-----------------------------\n");
		
		System.out.println("Digite o primeiro inteiro para adição:");
		
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo inteiro para adição:");
		
		int num2 = sc.nextInt();
		
		int adicao = num1 + num2;
		
		if(adicao > 10) {
			System.out.println("Resultado : " + adicao);
		}else {
			System.out.println("Resultado inferior a 10.");
		}
		System.out.println(">>>>>>>>>>RESULTADO<<<<<<<<<<");
		
		sc.close();
	}

}
