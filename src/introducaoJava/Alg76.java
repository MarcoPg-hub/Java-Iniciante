package introducaoJava;

import java.util.Scanner;

public class Alg76 {

	public static void main(String args[]) {

		/*
		 * Ler dois números reais e imprimir o quadrado da diferença do primeiro valor
		 * pelo segundo e a diferença dos quadrados.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro número real : ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor do segundo número real : ");
		double b = sc.nextDouble();
		
		double diferenca = Math.pow((a-b), 2);
		double diferencaQuadrado = Math.pow(a, 2) - Math.pow(b, 2);
		
		
		System.out.println("Diferença do primeiro valor pelo segundo é de : " + diferenca);
		System.out.println("Diferença dos quadrados é de : " + diferencaQuadrado);

		sc.close();
	}

}
