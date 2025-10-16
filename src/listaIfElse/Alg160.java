package listaIfElse;

import java.util.Scanner;

public class Alg160 {

	/*
	 * Alg 160: entrar com o valor de x e imprimir 
	 * y= f(x) = 
	 * {1 , se <=1
	 * { 2 , se 1 < x <= 2
	 * {x^2 , se 2 < x <= 3
	 * {x^3 , se x >3
	 */
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();
        double y;

        if (x <= 1) {
            y = 1;
        } else if (x <= 2) {
            y = 2;
        } else if (x <= 3) {
            y = x * x;
        } else {
            y = x * x * x;
        }

        System.out.println("y = " + y);

        sc.close();
    }
}

