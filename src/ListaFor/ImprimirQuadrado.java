package ListaFor;

import java.util.Scanner;

public class ImprimirQuadrado {
	public static void main(String args[]) {
		// entrar com 10 números e imprimir o quadrado de cada número
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Entre com o " + i + "º número:");
			double numero = sc.nextDouble();
			System.out.println("O quadrado de " + numero + " é : " + Math.pow(numero, 2));
		}

		sc.close();
	}
}
