package ListaFor;

public class Fibonacci {

	public static void main(String args[]) {

		/*
		 * Alg 208: criar um algoritmo que imprima os 10 primeiros termos da série de
		 * Fibonacci. Observação: os dois primeiros termos dessa série são 1 e 1 e os
		 * demais são gerados a partir da somas dos dois anteriores. Terceiro termo: 1º
		 * termo + 2º termo = 1 + 1 = 2 Quarto termo: 2º termo + 3º termo = 1 + 2 = 3
		 * Quinto termo: 3º termo + 4º termo = 2 + 3 = 5
		 */

		int anterior = 1; // primeiro termo
		int atual = 1; // segundo termo
		int proximo;

		System.out.print("Série de Fibonacci: ");

		for (int i = 1; i <= 10; i++) {
			System.out.print(anterior + " ");

			proximo = anterior + atual; // soma dos dois anteriores
			anterior = atual; // o atual vira anterior
			atual = proximo; // o próximo vira atual
		}
	}
}