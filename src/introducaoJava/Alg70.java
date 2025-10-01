package introducaoJava;

import java.util.Scanner;

public class Alg70 {

	public static void main(String args[]) {

		/*
		 * Ler dois valores para as variáveis A e B, efetuar a troca dos valores de
		 * forma que a variável A passe a ter o valor da variável B e que a variável B
		 * passe a ter o valor da variável A. Apresentar os valores trocados.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para ser atribuído a variável A : ");

		int a = sc.nextInt();

		System.out.println("Digite o valor para ser atribuído a variável B : ");

		int b = sc.nextInt();

		int troca = a;
		a = b;
		b = troca;

		System.out.println("O valor da variavel A agora é de " + a + " e o valor da variável B é de " + b);

		sc.close();
	}

}
