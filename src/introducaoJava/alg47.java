package introducaoJava;

import java.util.Scanner;

public class Alg47 {

	public static void main(String[] args) {
		/*
		 * Entrar com o número no formato CDU e imprimir invertido: UDC (Exemplo: 123,
		 * sairá 321). O número deverá ser armazenado em outra variável antes de ser
		 * impresso
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número em formado CDU : ");
		int num = sc.nextInt();

		double centena = num / 100;
		double dezena = (num / 10) % 10;
		int unidade = num % 10;

		double udc = (unidade * 100) + (dezena * 10) + centena;

		System.out.println("A impressão em formato UDC é : " + (int) udc);

		sc.close();
	}

}
