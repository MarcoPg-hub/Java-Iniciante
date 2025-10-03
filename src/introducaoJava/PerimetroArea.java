package introducaoJava;

import java.util.Scanner;

public class PerimetroArea {

	public static void main(String[] args) {
		// Entrar com o raio de um circulo e imprimir a seguinte saída: perimetro . area
		// formula area = pi*r² p = 2*pi*r

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do rario para o calcula do perímetro e da área: ");
		double raio = sc.nextDouble();

		double area = Math.PI * raio * raio;
		double perimetro = 2 * Math.PI * raio;

		System.out.printf("Perímeto : %.2f\n", perimetro);
		System.out.printf("Área : %.2f\n", area);

		sc.close();
	}

}
