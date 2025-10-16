package listaIfElse;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {

		/*
		 * Alg 93: entrar com um número e imprimir a raiz quadrada do número caso ele
		 * seja positivo e o quadrado do número caso ele seja negativo
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para iniciar o programa: ");
		
		double num = sc.nextDouble();
		
		if(num > 0 ) {
			System.out.println("Raiz quadrada : " + Math.sqrt(num));
		}else {
			System.out.println("Quadrado :" + Math.pow(num, 2));
		}		
		sc.close();
	}

}
