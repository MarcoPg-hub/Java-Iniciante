package introducaoJava;

import java.util.Scanner;

public class Alg69 {
	
	public static void main(String args[]) {
		
		/*Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:  
			prestacao = valor + (valor * (taxa/100) * tempo) */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação : ");
		
		double prestacao = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros : ");
		
		double taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo de atraso em dias : ");
		
		int tempo = sc.nextInt();
		
		double prestacaoAtraso = prestacao + ( prestacao * (taxa/100) * tempo);
		
		System.out.printf("O valor de uma prestação em atraso é de R$ %.2f" , prestacaoAtraso);
		
		sc.close();
	}

}
