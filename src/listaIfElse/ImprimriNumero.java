package listaIfElse;

import java.util.Scanner;

public class ImprimriNumero {
	
	public static void main(String args[]) {
		
		//Alg 90: Entrar com um número e imprimi-lo caso seja maior que 20 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para imprimir na tela:");
		int num = sc.nextInt();
		
		if(num >20) {
			System.out.println("Número: " + num);
		}else {
			System.out.println("Número inválido.Digite um número maior do que 20.");
		}
		
		sc.close();
	}

}
