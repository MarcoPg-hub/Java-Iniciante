package ListaFor;

import java.util.Scanner;

public class LeituraNumeroNatural {
	public static void main(String args[]) {
		/*
		 * criar um algoritmo que leia um número que será superior de um intervalo e o
		 * incremento (incr). Imprimir todos os números naturais de 0 até esse número.
		 * Suponha que os dois números lidos são maiores que zero. Exemplo: Limite
		 * superior: 20 Saída: 0 5 10 15 20 Incremento: 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número superior : ");
		int superior = sc.nextInt();
		
		System.out.println("Digite o valor do incremento : ");
		int incremento = sc.nextInt();
		
		for(int i = 0 ; i <= superior ; i += incremento) {
			System.out.printf(i + " ");
		}
		
		sc.close();
	}

}
