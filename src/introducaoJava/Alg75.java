package introducaoJava;

import java.util.Scanner;

public class Alg75 {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leia um número entre 0 e 60 e imprimir o seu sucessor,
		 * sabendo que o sucessor de 60 é 0. Não pode ser utilizado nenhum comando de
		 * seleção e nem de repetição.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número entre 0 e 60: ");
		int numero = sc.nextInt();

		int sucessor = (numero + 1) % 61;

		System.out.println("O sucessor é: " + sucessor);

		sc.close();
	}

}
