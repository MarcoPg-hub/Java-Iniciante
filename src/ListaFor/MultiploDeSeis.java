package ListaFor;

import java.util.Scanner;

public class MultiploDeSeis {
	public static void main(String args[]) {
		/*
		 * Alg 199: criar um algoritmo que leia os limites inferior e superior de um
		 * intervalo e imprima todos os números múltiplos de 6 no intervalo fechado.
		 * Suponha que os dados digitados são para um intervalo crescente. Limite
		 * inferior: 5 Limite superior: 13 Saída: 6 12
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o limite inferior: ");
		int limiteInferior = sc.nextInt();

		System.out.println("Digite o limite superior: ");
		int limiteSuperior = sc.nextInt();


		int numerosMultiplos = limiteInferior + (6 - limiteInferior % 6) % 6;

		for (int i = numerosMultiplos; i <= limiteSuperior; i += 6) {
			System.out.print(i + " ");

		}

		sc.close();
	}

}
