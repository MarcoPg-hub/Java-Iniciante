package listaIfElse;

import java.util.Scanner;

public class ImprimirMenorNumero {
	
	public static void main(String args[]) {
		
		//Alg 112: entrar com dois números e imprimir o menor número 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.println("O menor número é " + num1);
		}else if(num2 < num1) {
			System.out.println("O menor número é " + num2);
		}else {
			System.out.println("Os números são iguais.");
		}
		
		sc.close();
	}
}
