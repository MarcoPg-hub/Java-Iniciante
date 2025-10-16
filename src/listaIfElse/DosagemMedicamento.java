package listaIfElse;

import java.util.Scanner;

public class DosagemMedicamento {
	public static void main(String[] args) {

		/*
		 * Alg 152: criar um algoritmo que a partir da idade e peso do paciente calcule
		 * a dosagem de determinado medicamento e imprima a receita informando quantas
		 * gotas do mecidamento o paciente deve tomar por dose. Considere que o
		 * medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20
		 * gotas o Adultos ou adolescentes desde 12 anos, inlcusive, se tiverem peso
		 * igual ou acim de 60 quilos deve tomar 1000mg; com peso abaixo de 60 quilos
		 * devem tomar 875 mg o Para crianças e adolescentes abaixo de 12 anos a dosagem
		 * é calculada pelo peso corpóreo conforme a tabela a seguir: 5 kg a 9 kg = 125
		 * mg 9.1 kg a 16 kg = 250 mg 16.1 kg a 24 kg = 375 mg 24.1 kg a 30 kg = 500 mg
		 * Acima de 30 kg = 750 mg
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do paciente (anos): ");
		int idade = sc.nextInt();

		System.out.print("Digite o peso do paciente (kg): ");
		double peso = sc.nextDouble();

		double dosagemMg = 0;

		if (idade >= 12) {
			if (peso >= 60) {
				dosagemMg = 1000;
			} else {
				dosagemMg = 875;
			}
		} else {
			if (peso >= 5 && peso <= 9) {
				dosagemMg = 125;
			} else if (peso > 9 && peso <= 16) {
				dosagemMg = 250;
			} else if (peso > 16 && peso <= 24) {
				dosagemMg = 375;
			} else if (peso > 24 && peso <= 30) {
				dosagemMg = 500;
			} else if (peso > 30) {
				dosagemMg = 750;
			} else {
				System.out.println("Peso inválido para a idade.");
				sc.close();
				return;
			}
		}

		double dosagemMl = dosagemMg / 500.0;

		double gotas = dosagemMl * 20;

		System.out.println("===== Receita =====");
		System.out.printf("Idade: %d anos%n", idade);
		System.out.printf("Peso: %.1f kg%n", peso);
		System.out.printf("Dosagem: %.0f mg%n", dosagemMg);
		System.out.printf("Quantidade por dose: %.0f gotas%n", gotas);

		sc.close();
	}
}
