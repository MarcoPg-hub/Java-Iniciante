package ListaFor;

import java.util.Scanner;

public class RaizCubica {
	public static void main(String args[]) {
		// Alg 186: entrar com quatro números e imprimir o cubo e a raiz cúbica de cada
		// número

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite o " + i + "º número :");
			double numero = sc.nextDouble();

			System.out.println("O cubo de " + numero + " é : " + Math.pow(numero, 3) + 
					" , a raiz cúbica é igual a : " + Math.cbrt(numero));

		}

		sc.close();
	}

}
