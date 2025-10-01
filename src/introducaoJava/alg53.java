package introducaoJava;

import java.util.Scanner;

public class Alg53 {

	public static void main(String[] args) {
		// Criar um algoritmo que calcule i emprima a área de um triângulo
		// formula base * altura / 2

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da base para o cálculo da área do triângulo : ");
		int base = sc.nextInt();

		System.out.print("Digite o valor da altura : ");
		int altura = sc.nextInt();

		double area = (base * altura) / 2;

		System.out.println("A área do triângulo é : " + area);

		sc.close();
	}

}
