package ListaFor;

import java.util.Scanner;

public class SomaDosMultiplos {
	public static void main(String args[]) {

		/*
		 * Alg 196: criar um algoritmo que leia um número (num) e imprima a soma dos
		 * números múltiplos de 5 no intervalo aberto entre 1 e num. Suponha que num
		 * será maior que zero. num: 15 Multiplos de 5: 5 10 - Soma: 15
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para a soma dos multiplos de 5: ");
		int num = sc.nextInt();

		int somaMultiplos = 0;

		System.out.print("Multiplos de 5: ");

		for (int i = 5; i < num; i += 5) {
			somaMultiplos += i;
			System.out.print(i + " ");
		}

		System.out.println("Soma :" + somaMultiplos);

		sc.close();
	}

}
