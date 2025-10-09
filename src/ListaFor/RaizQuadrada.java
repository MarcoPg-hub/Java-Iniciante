package ListaFor;

import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String args[]) {
		//Alg 185: entrar com 15 números e imprimir a raiz quadrada de cada número 
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 1 ; i <= 15 ; i++) {
			System.out.println("Digite o " + i + "º número:");
			double numero = sc.nextDouble();
			
			if(numero > 0) {
				System.out.println("A raiz quadrada de " + numero + " é de :" + Math.sqrt(numero));
			} else {
				System.out.println("Número inválido para raiz quadrada (tem que ser positivo).");
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
