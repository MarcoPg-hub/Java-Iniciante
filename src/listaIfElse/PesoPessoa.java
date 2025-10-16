package listaIfElse;

import java.util.Scanner;

public class PesoPessoa {

	public static void main(String args[]) {

		/*
		 * Alg 133: segundo uma tabela médica, o peso ideal está relacionado com a
		 * altura e o sexo. Fazer um algoritmo que receba a altura e o sexo de uma
		 * pessoa, calcular e imprimir o seu peso ideal, utilizando as seguintes
		 * formulas: o o Para homens: (72.7 * H) – 58 Para mulheres: (62.1 * H) – 44.7
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();

		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();

		System.out.println("Sexo (M/F) : ");
		char sexo = Character.toUpperCase(sc.next().charAt(0));

		if (sexo == 'f') {
			double pesoMulher = (62.1 * altura) - 44.7;
			System.out.printf("Peso atual: %.2f kg%nPeso ideal: %.2f kg%n", peso, pesoMulher);
		} else {
			double pesoHomem = (72.7 * altura) - 58;
			System.out.printf("Peso atual: %.2f kg%nPeso ideal: %.2f kg%n", peso, pesoHomem);
		}

		sc.close();
	}

}
