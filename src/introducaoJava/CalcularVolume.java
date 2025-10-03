package introducaoJava;

import java.util.Scanner;

public class CalcularVolume {

	public static void main(String args[]) {
		/*
		 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
		 * fórmula: volume = 3.14159 * R^2 * altura.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio para o cálculo do volume : ");

		double raio = sc.nextDouble();

		System.out.println("Digite o valor da altura : ");

		double altura = sc.nextDouble();

		double volume = 3.14159 * Math.pow(raio, 2) * altura;

		System.out.println(" o valor do volume é de : " + volume);

		sc.close();
	}

}
