package introducaoJava;

import java.util.Scanner;

public class Alg39 {

	public static void main(String[] args) {
		// Entrar com dois números reais e imprimir a média aritmética com a mensagem
		// média antes do resultado .

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número real para iniciar o calculo da média : ");

		double num1 = sc.nextDouble();

		System.out.print("Digite o segundo número real para iniciar o calculo da média : ");

		double num2 = sc.nextDouble();
		double media = (num1 + num2) / 2;

		System.out.println("A média entre " + num1 + " e " + num2 + " é : " + media);
		sc.close();
	}

}
