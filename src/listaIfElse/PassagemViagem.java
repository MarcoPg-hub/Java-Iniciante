package listaIfElse;

import java.util.Scanner;

public class PassagemViagem {

	public static void main(String[] args) {

		/*
		 * Alg 148: criar um algoritmo que leia o destino do passageiro, se a viagem
		 * inclui retorno (ida e volta) e informar o preço da passagem conforme a tabela
		 * a seguir: Destino Ida Ida e volta Região norte R$ 500,00 R$ 900,00 Região
		 * nordeste R$ 350,00 R$ 650,00 Região centro-oeste R$ 350,00 R$ 600,00 Região
		 * sul R$ 300,00 R$ 550,00
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o destino da viagem:");
		System.out.println("Norte, Nordeste, Centro-oeste ou Sul");
		String destino = sc.nextLine().toLowerCase();

		System.out.println("A viagem é apenas ida ou ida e volta? (Digite 'ida' ou 'ida e volta')");
		String tipoViagem = sc.nextLine().toLowerCase();

		double preco = 0;

		if (destino.equals("norte")) {
			if (tipoViagem.equals("ida")) {
				preco = 500;
			} else if (tipoViagem.equals("ida e volta")) {
				preco = 900;
			} else {
				System.out.println("Tipo de viagem inválido!");
				sc.close();
				return;
			}
		} else if (destino.equals("nordeste")) {
			if (tipoViagem.equals("ida")) {
				preco = 350;
			} else if (tipoViagem.equals("ida e volta")) {
				preco = 650;
			} else {
				System.out.println("Tipo de viagem inválido!");
				sc.close();
				return;
			}
		} else if (destino.equals("centro-oeste")) {
			if (tipoViagem.equals("ida")) {
				preco = 350;
			} else if (tipoViagem.equals("ida e volta")) {
				preco = 600;
			} else {
				System.out.println("Tipo de viagem inválido!");
				sc.close();
				return;
			}
		} else if (destino.equals("sul")) {
			if (tipoViagem.equals("ida")) {
				preco = 300;
			} else if (tipoViagem.equals("ida e volta")) {
				preco = 550;
			} else {
				System.out.println("Tipo de viagem inválido!");
				sc.close();
				return;
			}
		} else {
			System.out.println("Destino inválido!");
			sc.close();
			return;
		}

		System.out.printf("O preço da passagem para %s (%s) é R$ %.2f%n", destino, tipoViagem, preco);

		sc.close();
	}
}
