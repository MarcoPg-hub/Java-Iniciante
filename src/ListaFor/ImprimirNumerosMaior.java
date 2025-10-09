package ListaFor;

import java.util.Scanner;

public class ImprimirNumerosMaior {

	public static void main(String args[]) {

		// Alg 231: entrar com 15 números e imprimir quantos números maiores que 30
		// foram digitados.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 15 números para inicar a contagem: ");

		int num = 0;
		int cont = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.println("Digite o " + i + "º número: ");
			num = sc.nextInt();
			if (num > 30) {
				cont++;
			}
		}
		System.out.println("Foram digitados " + cont + " números maiores do que 30.");

		sc.close();
	}

}
