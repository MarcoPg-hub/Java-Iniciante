package listaIfElse;

import java.util.Scanner;

public class CampeonatoArcoFlecha {

	public static void main(String args[]) {

		/*
		 * Alg 142: em um campeonato naconal de arco-e-flecha, tem-se equipes de três
		 * jogadores para cada estado. Sabendo-se que os arqueiros de uma equipe não
		 * obtiverem o mesmo número de pontos, criar um algoritmo que informe se uma
		 * equipe foi classificada, de acordo com a seguinte expecificação: o Ler
		 * ospontos obtidos por cada jogador da equipe o Mostrar esses valores em ordem
		 * decrescente o Se a soma dos pontos for maior do que 100, imprimir a média
		 * aritimetica entre eles, senão imprimir a mensagem “Equipe desclassificada
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Campeonato nacional de arco e flechas apuração:\n");

		System.out.println("Digite a pontuação do primeiro jogador: ");
		int jogador1 = sc.nextInt();

		System.out.println("Digite a pontuação do segundo jogador: ");
		int jogador2 = sc.nextInt();

		System.out.println("Digite a pontuação do terceiro jogador: ");
		int jogador3 = sc.nextInt();

		int soma = jogador1 + jogador2 + jogador3;

		int maior = 0, meio = 0, menor = 0;

		if (jogador1 < jogador2 && jogador1 < jogador3) {
			menor = jogador1;
			if (jogador2 < jogador3) {
				meio = jogador2;
				maior = jogador3;
			} else {
				meio = jogador3;
				maior = jogador2;
			}
		} else if (jogador2 < jogador1 && jogador2 < jogador3) {
			menor = jogador2;
			if (jogador1 < jogador3) {
				meio = jogador1;
				maior = jogador3;
			} else {
				meio = jogador3;
				maior = jogador1;
			}
		} else if (jogador3 < jogador1 && jogador3 < jogador2) {
			menor = jogador3;
			if (jogador1 < jogador2) {
				meio = jogador1;
				maior = jogador2;
			} else {
				meio = jogador2;
				maior = jogador1;
			}
		}
		System.out.printf("Pontuação dos jogadores:%n%n%d pontos %n%d pontos %n%d pontos%n%n", maior, meio, menor);

		if (soma > 100) {
			double media = soma / 3.0;
			System.out.println("A média entre os 3 jogadores foi de : " + media + " pontos.");
		} else {
			System.out.println("Equipe desclassificada.");
		}
		sc.close();
	}

}
