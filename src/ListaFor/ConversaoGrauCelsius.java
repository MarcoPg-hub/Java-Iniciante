package ListaFor;

import java.util.Scanner;

public class ConversaoGrauCelsius {

	public static void main(String args[]) {

		/*
		 * Alg 189: criar um algoritmo que imprima a tabela de conversão de graus
		 * Celsius-Fahrenheit para o intervalo desejado pelo usuário. O algoritmo deve
		 * solicitar ao usuário o limite superior do intervalo e o decremento. Formula
		 * de conversão -> c = 5 (f - 32) / 9 Exemplo: 
		 * Valores lidos: 68 50 14
		 * Impressão: 			Fahrenheit 		Celsius 
		 * 							68 			20 
		 * 							50 			14 
		 * 							10 			-10
		 */
			Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o limite superior do intervalo(em Fahreiheit)?");
		int limiteSuperior = sc.nextInt();
		
		System.out.println("Qual é o valor do decremento ?");
		int decremento = sc.nextInt();
		
		System.out.printf("%-12s %-12s%n", "Fahrenheit", "Celsius");
        System.out.println("-------------------------");
			
        for (int f = limiteSuperior; f >= 0; f -= decremento) {
            double celsius = 5 * (f - 32) / 9.0;
            System.out.printf("%-12d %-12.2f%n", f, celsius);
		}
		sc.close();
	}

}
