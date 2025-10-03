package introducaoJava;

import java.util.Scanner;

public class TercaParteReal {

	public static void main(String[] args) {
		// Ler um número real e imprimir a terça parte deste número.

		Scanner sc = new Scanner(System.in);

		double num = 22.50;
		double div = num / 3;

		System.out.printf("A terça parte de " + num + " é : " + div);
		sc.close();
	}

}
