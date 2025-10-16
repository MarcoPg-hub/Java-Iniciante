package listaIfElse;

import java.util.Scanner;

public class ValidaDataSimples {
	public static void main(String[] args) {

		/*
		 * Alg 156: criar um algoritmo que leia uma data (dia, mês, e ano em separado) e
		 * imprima se a da é válida ou não
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = sc.nextInt();

		System.out.print("Digite o mês: ");
		int mes = sc.nextInt();

		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();

		boolean dataValida = true;

		if (mes < 1 || mes > 12) {
			dataValida = false;
		} else {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia < 1 || dia > 31) {
					dataValida = false;
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia < 1 || dia > 30) {
					dataValida = false;
				}
			} else if (mes == 2) {
				boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

				if (bissexto) {
					if (dia < 1 || dia > 29) {
						dataValida = false;
					}
				} else {
					if (dia < 1 || dia > 28) {
						dataValida = false;
					}
				}
			}
		}

		if (dataValida) {
			System.out.println("Data válida.");
		} else {
			System.out.println("Data inválida.");
		}

		sc.close();
	}
}
