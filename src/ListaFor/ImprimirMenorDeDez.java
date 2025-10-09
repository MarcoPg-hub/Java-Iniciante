package ListaFor;

import java.util.Scanner;

public class ImprimirMenorDeDez {
	
	public static void main(String args[]) {
		
		//Alg 235: entrar com dez números (postivos ou negativos) e imprimir o maior e o menor número da lista. 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 números para imprimir o menor da lista: ");

		int num, menor = Integer.MAX_VALUE; // começa com o maior valor possível

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = sc.nextInt();

			if (num < menor) {
				menor = num;
			}
		}

		System.out.println("\nO menor número digitado foi: " + menor);

		sc.close();
	}
}