package introducaoJava;

import java.util.Scanner;

public class Alg36 {

	public static void main(String[] args) {
		// Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá
		// aparecer a mensagem soma
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 10;
		int soma = a + b;

		System.out.println("Soma : " + soma);
		sc.close();
	}

}
