package introducaoJava;

import java.util.Scanner;

public class Alg58 {

	public static void main(String[] args) {
		// Entrar com os valores dos catetos de um triângulo retângulo e imprimir a
		// hipotenusa

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para o Cateto a : ");
		int catetoA = sc.nextInt();

		System.out.println("Digite o valor para o Cateto b : ");
		int catetoB = sc.nextInt();

		double hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);

		System.out.printf("A hipotenusa é = %.0f\n", hipotenusa);

		sc.close();
	}
}
