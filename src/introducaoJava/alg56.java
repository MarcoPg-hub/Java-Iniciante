package introducaoJava;

import java.util.Scanner;

public class Alg56 {

	public static void main(String[] args) {

		// Entrar com as notas da PR1 e PR2 e imprimir a média final : truncada ,
		// arredondada

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a nota da PR1: ");
		double pr1 = scanner.nextDouble();

		System.out.print("Digite a nota da PR2: ");
		double pr2 = scanner.nextDouble();

		double media = (pr1 + pr2) / 2;
		int mediaTruncada = (int) media;
		double mediaArredondada = Math.round(media * 10.0) / 10.0;

		System.out.println("Média truncada: " + mediaTruncada);
		System.out.println("Média arredondada: " + mediaArredondada);

		scanner.close();
	}
}