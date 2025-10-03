package introducaoJava;

import java.util.Scanner;

public class DadosViagem {

	public static void main(String args[]) {

		/*
		 * Efetuar o cálculo da quantidade de litros de combustível gasto em uma viagem
		 * sabendo-se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo
		 * gasto na viagem e a velocidade média. Utilizar as seguintes formulas: o
		 * Distância = tempo x velocidade o Litros usados = distância / 12O algoritmo
		 * deverá apresentar os valores da velocidade média, tempo gasto na viagem,
		 * distância percorrida e a quantidade de litros utilizados na viagem.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual foi o tempo gasto na viagem ? ");

		double tempo = sc.nextDouble();

		System.out.println("Qual foi a velocidade média no percurso ? ");

		double velocidadeMedia = sc.nextDouble();

		double distancia = tempo * velocidadeMedia;
		double litrosUsados = distancia / 12.0;

		System.out.printf("Para uma viagem de %.2f hrs e uma distância de %.0f km foram gastos "
				+ "cerca de %.2f litros de combustível a uma velocidade média de %.2f km/h.", tempo,distancia,
				litrosUsados , velocidadeMedia);

		sc.close();
	}

}
