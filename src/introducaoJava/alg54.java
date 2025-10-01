package introducaoJava;

import java.util.Scanner;

public class alg54 {

	public static void main(String[] args) {
		// Criar um algoritmo que calcule i emprima a área de um losango
		// formula A = D * d / 2 D: DIAGONAL MAIOR d : diagonal menor

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da Diagonal maior para o cálculo da área do losango : ");
			int D = sc.nextInt();
			
			System.out.print("Digite o valor da Diagonal menor para o cálculo da área do losango : ");	
			int d = sc.nextInt();

			double area = (D * d) / 2;

		System.out.println("A área do losango é : " + area);

		sc.close();
	}

}
