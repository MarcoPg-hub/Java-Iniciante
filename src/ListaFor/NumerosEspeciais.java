package ListaFor;

public class NumerosEspeciais {

	public static void main(String args[]) {
		/*
		 * Alg 211: criar um algoritmo que imprima todos os números inteiros e positivos
		 * no intervalo aberto entre 10 e 100 de modo que: Não terminem em zero; Se o
		 * digito da direita for removido, o número restante é divisor do número
		 * original. Exemplos: 26: 2 é divisor de 26 80: 8 é divisor de 80
		 * 
		 */

		System.out.println("Números que satisfazem as condições:");

		for (int n = 11; n < 100; n++) { // intervalo aberto entre 10 e 100
			if (n % 10 != 0) { // não termina em zero
				int digitoEsquerda = n / 10; // remove o dígito da direita
				if (n % digitoEsquerda == 0) { // o restante divide o número original
					System.out.println(n + ": " + digitoEsquerda + " é divisor de " + n);
				}
			}
		}
	}
}