package ListaFor;

import java.util.Scanner;

public class ControleImpares {
	public static void main(String args[]) {

		/*
		 * Alg 197: criar um algoritmo que leia um número que servirá para controlar os
		 * primeiros número impares. Deverá ser impressa a soma desses números. Suponha
		 * que num será maior que zero. Quantos: 5  Impares: 1 3 5
		 * 7 9 - Soma: 25
		 */

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        System.out.println("Quantos: " + numero);
        System.out.print("Impares: ");

        // i será o número ímpar atual, j controla quantos ímpares foram impressos
        for (int i = 1, j = 0; j < numero; i += 2, j++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nSoma: " + soma);

        sc.close();
    }
}