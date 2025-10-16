package listaIfElse;

import java.util.Scanner;

public class ConsumoCarro {

	public static void main(String args[]) {

		/*
		 * Alg 146: fazer um algoritmo que leia o percurso em quilômetros, o tipo de
		 * carro e informe o consumo estimado de combustível, sabendo-se que um carro
		 * tipo A faz 12 km com um litro de gasolina, um tipo B faz 9 km e o tipo C, 8km
		 * por litro
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tipo do carro :");
		char carro = sc.nextLine().charAt(0);
		carro = Character.toUpperCase(carro);

		System.out.println("Digite o percurso percorrido: ");
		int percurso = sc.nextInt();

		double consumoMedio = 0;
		
		int tipoA = 12;
		int tipoB = 9;
		int tipoC = 8;

		if (carro == 'A') {
			consumoMedio = percurso / tipoA;
		} else if (carro == 'B') {
			consumoMedio = percurso / tipoB;
		} else if (carro == 'C') {
			consumoMedio = percurso / tipoC;
		} else {
			System.out.println("Tipo de carro inválido.");
		}

		System.out.println("Consumo médio para o " + carro + " foi de " + consumoMedio + " litros.");

		sc.close();
	}

}
