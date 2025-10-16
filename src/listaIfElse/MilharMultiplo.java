package listaIfElse;

import java.util.Scanner;

public class MilharMultiplo {

	public static void main(String args[]) {

		/*
		 * Alg 100: ler um número inteiro de 4 casas e imprimir se é ou não multiplo de
		 * quatro o número formado pelos algarismos que estão nas casas das unidades de
		 * milhar e das centenas.
		 */
		 Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro com 4 dígitos:");
        int num = sc.nextInt();

        // Valida se tem 4 dígitos
        if (num < 1000 || num > 9999) {
            System.out.println("Número inválido! Digite exatamente 4 dígitos.");
        } else {
            int milhar = num / 1000;        // pega o dígito das unidades de milhar
            int centena = (num / 100) % 10; // pega o dígito das centenas

            int numeroFormado = milhar * 10 + centena; // junta milhar + centena

            if (numeroFormado % 4 == 0) {
                System.out.println("O número formado pelo milhar e centena (" + numeroFormado + ") é múltiplo de 4.");
            } else {
                System.out.println("O número formado pelo milhar e centena (" + numeroFormado + ") não é múltiplo de 4.");
            }
        }

        sc.close();
    }
}
