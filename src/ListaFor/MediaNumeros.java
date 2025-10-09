package ListaFor;

import java.util.Scanner;

public class MediaNumeros {
	public static void main(String args[]) {

		/* Alg 213: entrar com 12 números e imprimir a média desses números. */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 12 números para o cálculo da média : ");
		double soma = 0; // acumulador
        double numero;;
		
		for(int i = 1 ; i <= 12 ; i++) {			
			numero = sc.nextDouble();
            soma += numero;		
		}		
		double media = soma / 12; // calcula a média

        System.out.println("A média dos números digitados é: " + media);
		sc.close();
	}

}
