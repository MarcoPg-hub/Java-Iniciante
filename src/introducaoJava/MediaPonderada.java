package introducaoJava;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		// Entrar com quatro números inteiros e imprimir a média ponderada, sabendo que
		// os pesos são respectivamente 1, 2, 3, e 4.
		// media ponderada é a soma dos produtos das notas pelos pesos respectivos e
		// depois divide essa soma pela somatoria dos pesos

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quatro números para calcular a média ponderada.");

		System.out.print("1º número : ");
		int num1 = sc.nextInt();

		System.out.print("2º número : ");
		int num2 = sc.nextInt();

		System.out.print("3º número : ");
		int num3 = sc.nextInt();

		System.out.print("4º número : ");
		int num4 = sc.nextInt();

		int peso1 = 1;
		int peso2 = 2;
		int peso3 = 3;
		int peso4 = 4;

		int somaProdutos = (num1 * peso1) + (num2 * peso2) + (num3 * peso3) + (num4 * peso4);
		int somaPesos = peso1 + peso2 + peso3 + peso4;

		double mediaPonderada = somaProdutos / somaPesos;

		System.out.println("A média ponderada entre os números digitados é " + mediaPonderada);
		sc.close();
	}

}
