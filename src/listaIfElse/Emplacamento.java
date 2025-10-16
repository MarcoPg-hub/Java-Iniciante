package listaIfElse;

import java.util.Scanner;

public class Emplacamento {

	public static void main(String args[]) {

		/*
		 * Alg 154: a polícia rodoviária resolveu fazer cumprir a lei e cobrar dos
		 * motoristas o DUT. Sabendo se que o mês em que o emplacamento do carro deve
		 * ser renovado é determinado pelo último número da placa do mesmo, criar um
		 * algoritmo que, a partir da leitura da placa do carro, informe o mês em que o
		 * emplacamento deve ser renovado.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a placa do veículo: ");
		String placa = sc.nextLine().toUpperCase();
		char ultimoDigito = placa.charAt(placa.length() - 1);

		System.out.printf("Para o veículo de placa %s , o emplacamento ficou para: " , placa);
		if (ultimoDigito == '0') {
			System.out.printf("Outubro");
		} else if (ultimoDigito == '1') {
			System.out.printf("Janeiro");
		} else if (ultimoDigito == '2') {
			System.out.printf("Fevereiro");
		} else if (ultimoDigito == '3') {
			System.out.printf("Março");
		} else if (ultimoDigito == '4') {
			System.out.printf("Abril");
		} else if (ultimoDigito == '5') {
			System.out.printf("Maio");
		} else if (ultimoDigito == '6') {
			System.out.printf("Junho");
		} else if (ultimoDigito == '7') {
			System.out.printf("Julho");
		} else if (ultimoDigito == '8') {
			System.out.printf("Agosto");
		} else if (ultimoDigito == '9') {
			System.out.printf("Setembro");
		} else {
			System.out.println("Digite uma placa valida.");
			sc.close();
			return;
		}

		sc.close();
	}

}
