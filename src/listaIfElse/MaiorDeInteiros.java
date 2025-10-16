package listaIfElse;

import java.util.Scanner;


public class MaiorDeInteiros {

	public static void main(String args[]) {

		// Alg 121: efetuar a leitura de cinco números inteiros diferentes e identificar
		// o maior e o menor valor

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 5 inteiros para inciar : ");
		System.out.println("--------------------------------");

		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		System.out.println("Digite o quarto número: ");
		int num4 = sc.nextInt();

		System.out.println("Digite o quinto número: ");
		int num5 = sc.nextInt();

		int maior, menor;

		maior = num1;
		menor = num1;

		if (num2 > maior) maior = num2;
		if (num3 > maior) maior = num3;
		if (num4 > maior) maior = num4;
		if (num5 > maior) maior = num5;

		if (num2 < menor) menor = num2;
		if (num3 < menor) menor = num3;
		if (num4 < menor) menor = num4;
		if (num5 < menor) menor = num5;

		System.out.println("Maior número : " + maior);
		System.out.println("Menor número : " + menor);

		sc.close();
	}

}
