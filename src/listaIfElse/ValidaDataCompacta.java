package listaIfElse;

import java.util.Scanner;

public class ValidaDataCompacta {
	public static void main(String[] args) {

		/*
		 * Alg 157: criar um algoritmo que leia uma data (no formato ddmmaaaa) e
		 * imprimir se a data é válida ou não
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a data no formato ddmmaaaa: ");
		String data = sc.nextLine();

		if (data.length() != 8) {
			System.out.println("Data inválida: formato incorreto.");
		}
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(2, 4));
		int ano = Integer.parseInt(data.substring(4, 8));

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
			System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
		} else {
			System.out.println("Data inválida.");
		}

		sc.close();
	}
}