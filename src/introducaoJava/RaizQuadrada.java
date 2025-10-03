package introducaoJava;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		/*
		 * Entrar com um número e imprimir a seguinte saída: número quadrado raiz
		 * quadrada
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite algum número para iniciar o programa : ");
		int num = sc.nextInt();

		System.out.println("Número : " + num);
		System.out.println("Quadrado : " + (int) Math.pow(num, 2));
		System.out.println("Raiz quadrada : " + (int) Math.sqrt(num));

		sc.close();
	}

}
