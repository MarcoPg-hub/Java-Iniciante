package ListaFor;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String args[]) {

		/*
		 * Alg 245: criar um algoritmo que receba a idade e o peso de 20 pessoas.
		 * Calcular e imprimir as médias dos pesos das pessoas da mesma faixa etária. As
		 * faixas etárias são:de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores
		 * de 30 anos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome e idade , peso de 20 pessoas para o cálculo da faixa etária: ");
		
		int cont1 = 0, cont2 = 0 , cont3 = 0 , cont4 = 0;
		double peso1 = 0, peso2 = 0 , peso3 = 0 , peso4 = 0;
		double peso =0;
		
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa:");
			int idade = sc.nextInt();
		
			System.out.println("Digite o peso:");
			peso = sc.nextDouble();
			
			if(idade >= 1 && idade <= 10) {
				cont1++;
				peso1+= peso;
			}else if(idade >= 11 && idade <= 20 ) {
				cont2++;
				peso2+= peso;
			}else if(idade >= 21 && idade <= 30) {
				cont3++;
				peso3+= peso;
			}else {
				cont4++;
				peso4+= peso;
			}
			
		}
		double pesoMedio1 = peso1 / cont1;
		double pesoMedio2 = peso2 / cont2;
		double pesoMedio3 = peso3 / cont3;
		double pesoMedio4 = peso4 / cont4;
		System.out.println("Temos " + cont1 + " pessoas com a faixa etaria entre 1 a 10 anos e peso médio de " + (int)pesoMedio1 + "KG");
		System.out.println("Temos " + cont2 + " pessoas com a faixa etaria entre 11 a 20 anos e peso médio de " + (int)pesoMedio2 + "KG");
		System.out.println("Temos " + cont3 + " pessoas com a faixa etaria entre 21 a 30 anos e peso médio de " + (int)pesoMedio3 + "KG");
		System.out.println("Temos " + cont4 + " pessoas com a faixa etaria maiores que 30 anos e peso médio de " + (int)pesoMedio4 + "KG");
		
		sc.close();
	}

}
