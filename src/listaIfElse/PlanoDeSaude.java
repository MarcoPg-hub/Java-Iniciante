package listaIfElse;

import java.util.Scanner;

public class PlanoDeSaude {

	public static void main(String args[]) {
		/*
		 * Alg 136: depois da liberação do governo para as mensalidade dos planos de
		 * saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano,
		 * não muito caro. Um vendedor de um plano de saúde apresentou a tabela a
		 * seguir. Criar um algoritmo que entre com o nome e a idade de uma pessoa e
		 * imprimir o nome e o valor que ela deverá pagar: Faixa etária Até 10 anos
		 * Valor R$ 30,00 Acima de 10 até 29 anos R$ 60,00 Acima de 29 até 45 anos R$
		 * 120,00 Acima de 45 até 59 anos R$ 150,00 Acima de 59 até 65 anos R$ 250,00
		 * Maior que 65 anos R$ 400,00
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		double planoSaude = 0;
		
		if(idade >= 0 && idade <=10) {
			planoSaude = 30;
		}else if(idade > 10 && idade <= 29){
			planoSaude = 60;
		}else if(idade > 29 && idade <= 45) {
			planoSaude = 120;
		}else if(idade > 45 && idade <= 59) {
			planoSaude = 150;
		}else if(idade > 59 && idade <= 65) {
			planoSaude = 250;
		}else if(idade > 65) {
			planoSaude = 400;
		}else {
			System.out.println("Idade inválida , digite a idade novamente.");
			sc.close();
			return;
		}
		
		System.out.printf("Nome: %s%nValor do plano de saúde: R$ %.2f" , nome , planoSaude);
		sc.close();
	}

}
