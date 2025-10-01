package introducaoJava;

import java.util.Scanner;

public class alg51 {

	public static void main(String[] args) {
		// Entrar com o lado de um quadrado e imprimir a seguinte saída:Perimetro, Área, diagonal
		// formulas petrimetro a = 4*l , area = L² , diagonal a = L * raiz(2)

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do lado para os calculos do quadrado : ");
			double lado = sc.nextDouble();

			double perimetro = 4 * lado;
			double area = Math.pow(lado, 2);
			double diagonal = lado * Math.sqrt(2);

		System.out.printf("Perímetro : %.2f\n", perimetro);
		System.out.printf("Área : %.2f\n", area);
		System.out.printf("Diagonal : %.2f\n", diagonal);
		
		sc.close();
	}

}
