package listaIfElse;

import java.util.Scanner;

public class ControlePoluicao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * Alg 153: o prefeito do Rio de Janeiro contratou uma firma especializada para
		 * manter os níveis de poluição considerados ideais para um país do 1º mundo. As
		 * indústrias, maiores responsáveis pela poluição, foram classificadas em três
		 * grupos. Sanbendo-se que a escala utilizada varia de 0,05 e que o índice de
		 * poluição aceitavel é até 0,25, fazer um algoritmo que possa imprimir
		 * intimações de acordo com o índice e a tabela a seguir: Índice Indústrias que
		 * receberão intimação 0.3 1º grupo 0.4 1º e 2º grupos 0.5 1º, 2º e 3º grupos
		 */

		System.out.print("Informe o índice de poluição (ex: 0.25): ");
		double indice = scanner.nextDouble();

		if (indice < 0.05 || indice > 0.5) {
			System.out.println("Índice fora da faixa válida (0.05 a 0.5).");
		} else if (indice <= 0.25) {
			System.out.println("Índice aceitável. Nenhuma indústria será intimada.");
		} else if (indice <= 0.3) {
			System.out.println("Intimar as indústrias do 1º grupo.");
		} else if (indice <= 0.4) {
			System.out.println("Intimar as indústrias do 1º e 2º grupos.");
		} else {
			System.out.println("Intimar as indústrias do 1º, 2º e 3º grupos.");
		}

		scanner.close();
	}
}
