package ListaFor;

import java.util.Scanner;

public class SuperiorInferiorPares {

	public static void main(String args[]) {

		/*
		 * Alg 201: criar um algoritmo que leia os limites inferior e superior de um
		 * intervalo e imprimir todos os números pares no intervalo aberto e se
		 * somatório. Suponha que os dados digitados são para um intervalo crescente.
		 * Limite inferior: 3 Limite superior: 12 Número: 3 Saída: 4 6 8 10 - soma: 28
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número Inferior: ");
		int inferior = sc.nextInt();

		System.out.println("Digite o número Superior: ");
		int superior = sc.nextInt();

		int soma = 0;

		for (int i = inferior; i < superior; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				soma += i;
			}
		}
		System.out.println("Soma : " + soma);
		sc.close();

	}

}
