package introducaoJava;

import java.util.Scanner;

public class Alg48 {

	public static void main(String[] args) {
		/*
		 * Antes do racionamento de energia ser decretado, quase ninguém falava em
		 * quilowatts, mas, agora, todos imcorporaram essa palavra em seu vocabulário.
		 * Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
		 * fazer um algoritmo que receba o valor do salário mínimo e a quantidade de
		 * quilowatts gasta por uma residência e calcule. Imprima: O valor em reais de
		 * cada quilowatt O valor em reais a ser pago O novo valor a ser pago por essa
		 * residência com um desconto de 10%
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo : ");
		double salario = sc.nextDouble();

		System.out.println("Didite quantos KW a residência gasta ? ");
		double kw = sc.nextDouble();

		double valorKW = (salario / 7) / 100;
		double valorPago = kw * valorKW;
		double desconto = 10 / 100.0;
		double novoValor = valorPago - (valorPago * desconto);

		System.out.println("O valor em reais de cada quilowatt é de R$" + valorKW);
		System.out.println("O valor em reais a ser pago é de R$" + valorPago);
		System.out.println("O novo a ser pago com 10% de desconto é de  R$" + novoValor);

		sc.close();
	}

}
