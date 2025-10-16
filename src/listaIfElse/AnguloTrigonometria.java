package listaIfElse;

import java.util.Scanner;

public class AnguloTrigonometria {

	public static void main(String[] args) {

		/*
		 * Alg 150: criar um algoritmo que leia um ângulo em graus e apresente: o o seno
		 * do ângulo, se o ângulo pertencer a um quadrante par o o co-seno do ângulo, se
		 * o ângulo pertencer a um quadrante impar
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o ângulo em graus (0 a 360): ");
		double angulo = sc.nextDouble();

		angulo = angulo % 360;

		double rad = Math.toRadians(angulo);

		int quadrante = 0;
		if (angulo > 0 && angulo < 90) {
			quadrante = 1;
		} else if (angulo > 90 && angulo < 180) {
			quadrante = 2;
		} else if (angulo > 180 && angulo < 270) {
			quadrante = 3;
		} else if (angulo > 270 && angulo < 360) {
			quadrante = 4;
		} else {
			System.out.println("Ângulo no eixo, não pertence a um quadrante.");
			sc.close();
			return;
		}

		if (quadrante % 2 == 0) {
			System.out.printf("Quadrante %d (par). Seno: %.4f%n", quadrante, Math.sin(rad));
		} else {
			System.out.printf("Quadrante %d (ímpar). Cosseno: %.4f%n", quadrante, Math.cos(rad));
		}

		sc.close();
	}
}
