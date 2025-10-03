package introducaoJava;

import java.util.Scanner;

public class DiagonaisDiferentes {

	public static void main(String args[]) {

		/*
		 * Dado um polígono conexo de n lados, podemos calcular o número de diagonais
		 * diferentes (nd) desse polígono pela formula: nd = n * (n - 3) / 2. Fazer um
		 * algoritmo que leia quantos lados tem o polígono, calcule e escreva o número
		 * de diagonais diferentes (nd) do mesmo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos lados tem o polígono : ");

		int ladoPoligono = sc.nextInt();
		int diagonais = ladoPoligono * (ladoPoligono - 3) / 2;

		System.out.println("O número de diagonais diferentes desse polígono é de : " + diagonais);

		sc.close();

	}

}
