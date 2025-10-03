package introducaoJava;

import java.util.Scanner;

public class MinutosDia {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que leia um valor de hora e informe quantos minuts se
		 * parassram desde o início do dia.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da hora atual :");

		double hora = sc.nextDouble();

		double horaMinutosPassados = hora * 60;

		System.out.println("Desde o início do dia se passaram " + horaMinutosPassados + " minutos.");

		sc.close();
	}

}
