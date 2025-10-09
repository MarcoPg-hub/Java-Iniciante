package ListaFor;

import java.util.Scanner;

public class NumNegativo {

	public static void main(String args[]) {

		/*
		 * Alg 205: criar um algoritmo que leia um número (num) da entrada em seguida,
		 * ler n números inteiros da entrada negativos e imprimir o maior deles. Número
		 * lido: 5 Dígitos: -3 -12 -4 -63 -50 - maior: -3
		 */

		Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int maior = Integer.MIN_VALUE; // começa com o menor valor possível
        int valor;

        System.out.println("Digite os " + n + " números negativos:");

        for (int i = 1; i <= n; i++) {
            valor = sc.nextInt();
            if (valor > maior) { // compara para encontrar o maior
                maior = valor;
            }
        }

        System.out.println("Maior: " + maior);
        sc.close();
    }
}
