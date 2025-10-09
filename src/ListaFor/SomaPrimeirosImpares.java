package ListaFor;

import java.util.Scanner;

public class SomaPrimeirosImpares {
	public static void main(String args[]) {
		/*
		 * Alg 197: criar um algoritmo que leia um número que servirá para controlar os
		 * primeiros número impares. Deverá ser impressa a soma desses números. Suponha
		 * que num será maior que zero. Quantos: 5 Impares: 1 3 5 7 9 - Soma: 25
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para controle dos ímpares: ");
        int controleImpar = sc.nextInt();
        int soma = 0;

        if (controleImpar > 0) {
            int impar = 1;
            System.out.print("Ímpares: ");
            for (int i = 1; i <= controleImpar; i++) {
                System.out.print(impar + " ");
                soma += impar;
                impar += 2; 
            }
            System.out.println("- Soma: " + soma);
        }

        sc.close();
    }
}
