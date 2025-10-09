package ListaFor;

import java.util.Scanner;

public class Logaritmo {
	public static void main(String args[]) {
		// Alg 184: entrar com 8 números e, para cada número, imprimir o logaritmo desse
		// número na base 10
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {
			System.out.println("Digite o " + i + "º número:");
			double numero = sc.nextDouble();

			if (numero > 0) {
				System.out.println("O logaritimo de " + numero + " na base 10 é de : " + Math.log10(numero));
			} else {
				System.out.println("Número inválido para logaritmo (tem que ser positivo).");
			}

		}
		sc.close();
	}

}
