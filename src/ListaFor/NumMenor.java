package ListaFor;

import java.util.Scanner;

public class NumMenor {

	public static void main(String args[]) {

		/*
		 * Alg 206: criar um algoritmo que leia a quantidade de números que se deseja
		 * digitar para que posse ser impresso o maior e o menor número digitados. Não
		 * suponha que todos os números lidos serão positivos.
		 */

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja informar: ");
        int num = sc.nextInt();

        int maior = Integer.MIN_VALUE; // começa com o menor valor possível
        int menor = Integer.MAX_VALUE; // começa com o maior valor possível
        int valor;

        System.out.println("Digite os " + num + " números:");

        for (int i = 1; i <= num; i++) {
            valor = sc.nextInt();

            if (valor > maior) {
                maior = valor; // atualiza o maior
            }
            if (valor < menor) {
                menor = valor; // atualiza o menor
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
