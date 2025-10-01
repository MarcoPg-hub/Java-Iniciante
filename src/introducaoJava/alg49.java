package introducaoJava;

import java.util.Scanner;

public class Alg49 {

	public static void main(String[] args) {
		// Entrar com a base e a altura de um retângulo e imprimir a seguinte
		// saída:Perimetro Área Diagonal

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a base do retângulo : ");
		int b = sc.nextInt();

		System.out.print("Digite a altura do retãngulo: ");
		int a = sc.nextInt();

		double perimetro = (2 * a) + (2 * b);
		int area = b * a;
		double diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));

		System.out.println("Perímetro : " + perimetro + "\nÁrea : " + area + "\nDiagonal : " + diagonal);

		sc.close();

	}

}
