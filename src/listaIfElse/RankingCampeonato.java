package listaIfElse;

import java.util.Scanner;

public class RankingCampeonato {

	public static void main(String args[]) {

		/*
		 * • Alg 141: criar um algoritmo que leia o nome e o total de pontos de três
		 * finalistas de um campeonato de pingue-pongue e exibir a colocação da seguinte
		 * forma: o Vencedor: ______________________ xxx pontos o Segundo colocado:
		 * ______________ xxx pontos o Terceiro colocado: _____________ xxx pontos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(">>>Campeonato de pingue-pongue<<<\n ");

		System.out.println("Digite o nome do primeiro competidor: ");
		String nome1 = sc.nextLine();
		System.out.println("Digite sua pontuação: ");
		int primeiroCompetidor = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do terceiro competidor: ");
		String nome2 = sc.nextLine();		
		System.out.println("Digite sua pontuação ");
		int segundoCompetidor = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do primeiro competidor: ");
		String nome3 = sc.nextLine();
		System.out.println("Digite sua pontuação ");
		int terceiroCompetidor = sc.nextInt();
		sc.nextLine();
		
		String primeiroNome = "" , segundoNome = "" , terceiroNome = "";

		int primeiro = 0, segundo = 0, terceiro = 0;

		if (primeiroCompetidor > segundoCompetidor && primeiroCompetidor > terceiroCompetidor) {
			primeiro = primeiroCompetidor;
			primeiroNome = nome1;
			if (segundoCompetidor > terceiroCompetidor) {
				segundoNome = nome2;
				segundo = segundoCompetidor;
				terceiro = terceiroCompetidor;
				terceiroNome = nome3;
			} else {
				segundoNome = nome3;
				segundo = terceiroCompetidor;
				terceiro = segundoCompetidor;
				terceiroNome = nome2;
			}
		} else if (segundoCompetidor > primeiroCompetidor && segundoCompetidor > terceiroCompetidor) {
			primeiro = segundoCompetidor;
			primeiroNome = nome2;
			if (primeiroCompetidor > terceiroCompetidor) {
				segundoNome = nome1;
				segundo = primeiroCompetidor;
				terceiro = terceiroCompetidor;
				terceiroNome = nome3;
			} else {
				segundoNome = nome3;
				segundo = terceiroCompetidor;
				terceiro = primeiroCompetidor;
				terceiroNome = nome1;
			}
		} else if (terceiroCompetidor > primeiroCompetidor && terceiroCompetidor > segundoCompetidor) {
			primeiro = terceiroCompetidor;
			primeiroNome = nome3;
			if (segundoCompetidor > primeiroCompetidor) {
				segundoNome = nome2;
				segundo = segundoCompetidor;
				terceiro = primeiroCompetidor;
				terceiroNome = nome1;
			} else {
				segundoNome = nome1;
				segundo = primeiroCompetidor;
				terceiro = segundoCompetidor;
				terceiroNome = nome2;
			}
		}

		System.out.printf("----------APURAÇÃO FINAL DE PONTOS----------%n");
		System.out.printf("Primeiro colocado: %s - %d pontos%n", primeiroNome , primeiro);
		System.out.printf("Segundo colocado: %s - %d pontos%n", segundoNome , segundo);
		System.out.printf("Terceiro colocado: %s - %d pontos%n", terceiroNome , terceiro);
		System.out.printf("--------------------------------------------%n");

		sc.close();
	}

}
