package listaIfElse;

import java.util.Scanner;

public class ValorDeX {
    public static void main(String[] args) {
    	
    	/*
    	 * Alg 158: criar um algoritmo que entre com o valor de x, calcule e imprima o valor de 
    	 * f(x) = 8 / 2 - x
    	 */
        Scanner sc = new Scanner(System.in);

        System.out.println("Alg 158: Calcular f(x) = 8 / (2 - x)");
        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        if (x == 2) {
            System.out.println("Erro: divisão por zero. f(x) não está definida para x = 2.");
        } else {
            double fx = 8 / (2 - x);
            System.out.println("f(x) = " + fx);
        }

        sc.close();
    }
}