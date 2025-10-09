package ListaFor;

import java.util.Scanner;

public class ImprimirMaiorMenor {

	public static void main(String ar[]) {

		/*
		 * Alg 233: entrar com dois númros e imprimir todos os números no intervalo
		 * fechado, do menor para o maior.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		int menor, maior;

		if (num1 < num2) {
			menor = num1;
			maior = num2;
		} else {
			menor = num2;
			maior = num1;
		}

		System.out.println("\nNúmeros no intervalo fechado entre " + menor + " e " + maior + ":");

		for (int i = menor; i <= maior; i++) {
			System.out.print(i + " ");
		}

		sc.close();
	}
}
