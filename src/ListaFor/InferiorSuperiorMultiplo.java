package ListaFor;

import java.util.Scanner;

public class InferiorSuperiorMultiplo {
	
	public static void main(String args[]) {
		/*Alg 199: criar um algoritmo que leia os limites inferior e superior de um intervalo e imprima todos os 
		números múltiplos de 6 no intervalo fechado. Suponha que os dados digitados são para um intervalo 
		crescente. 
		Limite inferior: 5 
		Limite superior: 13      
		Saída: 6  12 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número inferior:");
		int inferior = sc.nextInt();
		int primeiroMultiplo = inferior + (6 - inferior % 6) % 6; 
		
		System.out.println("Digite o número superior:");
		int superior = sc.nextInt();
		
		for(int i = primeiroMultiplo ; i <= superior ; i += 6) {
			
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
