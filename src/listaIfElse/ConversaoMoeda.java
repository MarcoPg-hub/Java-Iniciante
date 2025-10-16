package listaIfElse;

import java.util.Scanner;

public class ConversaoMoeda {

	public static void main(String args[]) {

		/*
		 * Alg 132: fazer um algoritmo que possa converter uma determinada quantia dada
		 * em reais para uma das seguintes moedas:
		 * F – franco suíço
		 * I – libra esterlina
		 * D – dólar
		 * M – marco alemão
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor em reais (R$): ");
		double reais = sc.nextDouble();

		System.out.print("Digite a moeda para conversão (F - franco suíço, I - libra, D - dólar, M - marco): ");
		char tipo = Character.toUpperCase(sc.next().charAt(0));

		double convertido = 0;

		// taxas de conversão fictícias (você pode ajustar se quiser)
		double taxaFranco = 6.25;
		double taxaLibra = 6.45;
		double taxaDolar = 5.60;
		double taxaMarco = 3.30;

		if (tipo == 'F') {
			convertido = reais / taxaFranco;
			System.out.printf("R$%.2f equivalem a %.2f francos suíços.%n", reais, convertido);
		} else if (tipo == 'I') {
			convertido = reais / taxaLibra;
			System.out.printf("R$%.2f equivalem a %.2f libras esterlinas.%n", reais, convertido);
		} else if (tipo == 'D') {
			convertido = reais / taxaDolar;
			System.out.printf("R$%.2f equivalem a %.2f dólares.%n", reais, convertido);
		} else if (tipo == 'M') {
			convertido = reais / taxaMarco;
			System.out.printf("R$%.2f equivalem a %.2f marcos alemães.%n", reais, convertido);
		} else {
			System.out.println("Código de moeda inválido! Use apenas F, I, D ou M.");
		}

		sc.close();
	}
}