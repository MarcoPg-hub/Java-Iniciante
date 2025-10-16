package listaIfElse;

import java.util.Scanner;

public class DescontoCliente {

	public static void main(String args[]) {

		/*
		 * Alg 140: um restaurante faz uma promoção semanal de descontos para clientes
		 * de acordo com as iniciais do nome da pessoa. Criar um algoritmo que leia o
		 * primeiro nome do cliente, o valor de sua conta e se o nome iniciar com as
		 * letras A, D, M ou S, dar um desconto de 30%. Para o cliente cujo nome não se
		 * inicia por nenhuma dessas letras, exibir a mensagem “Que pena. Nesta semana o
		 * desconto não é para seu nome, mas continue nos prestigiando que sua vez
		 * chegará”.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o valor da conta do cliente: ");
		double contaCliente = sc.nextDouble();
		
		char nomeCliente = nome.toUpperCase().charAt(0);
		
		if(nomeCliente == 'A' || nomeCliente == 'D' || nomeCliente == 'M' || nomeCliente == 'S') {
			double desconto = contaCliente - (contaCliente * 0.30);
			System.out.printf("Parabéns %s!!! Você ganhou 30%% de desconto e sua "
					+ "conta foi de %.2f para R$%.2f reais." , nome , contaCliente , desconto );			
		}else {
			System.out.println("Que pena. Nesta semana o desconto não é para seu nome, "
					+ "mas continue nos prestigiando que sua vez chegará");
		}
		
		sc.close();
	}

}
