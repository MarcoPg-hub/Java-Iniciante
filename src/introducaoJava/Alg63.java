package introducaoJava;

import java.util.Scanner;

public class Alg63 {

	public static void main(String args[]) {

		/*
		 * Ler uma temperatura em graus centígrados e apresentá-la convertida em graus
		 * Fahrenheit. A fórmula de conversão é F= (9*C+160)/5 F onde F é a temperatura
		 * em Fahrenheit e C é a temperatura em centígrados.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus centígrados para conversão em Fahrenheit : ");
		double temperatura = sc.nextDouble();
		double temperaturaConversao = ((9 * temperatura) + 160) / 5;

		System.out.printf("A temperatura %.2f °C convertida em Fahrenheit é %.2f °F%n",
		        temperatura, temperaturaConversao);
		sc.close();
	}

}
