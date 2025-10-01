package introducaoJava;

import java.util.Scanner;

public class Alg80 {

	public static void main(String args[]) {

		/*
		 * Criar um algoritmo que dado um número de uma conta corrente com três dígitos,
		 * retorne o seu dígito verificador, o qual é calculado da seguinte maneira.
		 * Exemplo: número da conta: 235 
		 * • Somar o número da conta com o seu inverso:235 + 532 = 767 
		 * Multiplicar cada dígito pela sua ordem posicional e somar estes resultados: 767 
		 * 7   6  7 
		 * x1 x2 x3 
		 * 7 + 12 + 21 = 40
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta corrente com 3 dígitos : ");
		int contaCorrente = sc.nextInt();
		
		int centena = contaCorrente /100;
		int dezena = (contaCorrente/10) % 10;
		int unidade = contaCorrente % 10;
		int inverso = unidade * 100 + dezena *10 + centena;
		
		int soma = contaCorrente + inverso;
		
		int d1 = soma / 100;
		int d2 = (soma /10) % 10;
		int d3 = soma % 10;
		
		int digitoVerificador = d1 * 1 + d2 * 2 + d3 * 3;
		 
		System.out.println("O digito verificador da conta corrente é " + digitoVerificador);
		
		sc.close();
	}

}
