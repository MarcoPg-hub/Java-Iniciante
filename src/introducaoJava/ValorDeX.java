package introducaoJava;

import java.util.Scanner;

public class ValorDeX {

	public static void main(String[] args) {
		// Entrar com os valores para xnum1, xnum2, xnum3 e imprimir o valor de x,
		// sabendo-se que:

		Scanner sc = new Scanner(System.in);

		double xnum1, xnum2, xnum3, X;

		System.out.println("Digite o valor de xnum1 para calcular o valor de x : ");
		xnum1 = sc.nextInt();

		System.out.println("Digite o valor de xnum2 para calcular o valor de x : ");
		xnum2 = sc.nextInt();

		System.out.println("Digite o valor de xnum3 para calcular o valor de x : ");
		xnum3 = sc.nextInt();
		X = xnum1 + (xnum2 / (xnum3 + xnum1)) + 2 * (xnum1 - xnum2) + Math.log(64) / Math.log(2);

		System.out.println("O valor de x é : " + (Math.round(X)));

		sc.close();
	}
}
