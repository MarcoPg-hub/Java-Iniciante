package introducaoJava;

import java.util.Scanner;

public class Alg52 {

	public static void main(String[] args) {
		// Entrar com os lados a, b, c, de um paralelepípedo. Calcular e imprimir a
		// diagona
		// formula d = raiz(a²+b²+c²)

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor dos lados a , b e c para o cálculo da da diagonal do paralelepipedo");

		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.print("B = ");
		int b = sc.nextInt();

		System.out.print("C = ");
		int c = sc.nextInt();

		double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

		System.out.println("A diagonal do paralelepipedo é : " + diagonal);

		sc.close();
	}

}
