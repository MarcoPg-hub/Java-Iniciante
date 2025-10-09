package ListaFor;

public class ValorDeB {
	public static void main(String args[]) {
		/*
		 * Alg 187: criar um algoritmo que calcule e imprima o valdor de b^n. O valor de
		 * n deverá ser maior do que 1 e inteiro e o valor de b maior ou igual a 2 e
		 * inteiro.
		 */

		int b = 2; 
		int n = 10; 

		int resultado = 1;

		for (int i = 1; i <= n; i++) {
			resultado *= b; 
		}

		System.out.println(b + "^" + n + " = " + resultado);
	}
}
