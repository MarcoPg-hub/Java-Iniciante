package ListaFor;

import java.util.Scanner;

public class ImprimirDezNumeros {
	public static void main(String args[]) {
		// entrar com 10 números e imprimir a metade de cada número
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			int numero = sc.nextInt();
			System.out.println("A metade de " + numero + " é " + (numero / 2));
		}
		sc.close();

	}

}
