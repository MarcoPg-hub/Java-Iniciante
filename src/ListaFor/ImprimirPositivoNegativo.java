package ListaFor;

import java.util.Scanner;

public class ImprimirPositivoNegativo {
	
	public static void main(String args[]) {
		
		//Alg 232: entrar com 20 números e imprimir a soma dos positivos e o total de números negativos. 
		
		System.out.println("Digite 20 números para imprimir os positivos e os negativos");
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int contPositivo = 0;
		int contNegativo = 0;
		
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println("Digite o " + i + "º número: ");
			num = sc.nextInt();
			if(num >= 0) {
				contPositivo++;
			}else {
				contNegativo++;
			}
		}
		System.out.println("Foram digitados " + contPositivo + " números positivos e " 
		+ contNegativo + " números negativos");
		sc.close();
	}

}
