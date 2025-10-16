package listaIfElse;

import java.util.Scanner;

public class EscolhaMes {

	public static void main(String args[]) {
		/*
		 * Alg 138: ler um número inteiro entre 1 e 12 e escrever o mês correspondente.
		 * Caso usuário digite um número fora desse intervalo, deverá aparecer uma
		 * mensagem informando que não existe mês com este número
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro para imprimir o mês na tela:");

		int mes = sc.nextInt();

		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Não existe mês com esse número.");
		}

		sc.close();
	}

}
