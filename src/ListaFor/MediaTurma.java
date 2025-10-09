package ListaFor;

import java.util.Scanner;

public class MediaTurma {
	public static void main(String args[]) {
		/*
		 * Alg 214: entrar com nome, nota da PR1, nota da PR2 de 15 alunos. Imprimir uma
		 * listagem, contendo: nome, nota da PR1, nota da PR2 e média arredondade de
		 * cada alunos. Ao final, calcule a média geral da turma.
		 */

		Scanner sc = new Scanner(System.in);
		String nome;
		double primeiraNota;
		double segundaNota;
		double media = 0;
		double somaMediasTurma = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.println("Digite o nome do " + i + "º aluno: ");
			nome = sc.nextLine();
			sc.nextLine();
			
			System.out.print("PR1 : ");
			primeiraNota = sc.nextDouble();
			
			System.out.print("PR2 : ");
			segundaNota = sc.nextDouble();
			sc.nextLine();
			
			media = (primeiraNota + segundaNota) / 2.0;
			
			somaMediasTurma += media;

			System.out.println("Nome : " + nome + " nota da PR1 : " + primeiraNota + " nota da PR1 : " + segundaNota
					+ " Média : " + (int)Math.round(media));
		}
		double mediaGeral = somaMediasTurma / 15.0;
		System.out.println("Media geral da turma : " + (int)Math.round(mediaGeral));
		sc.close();
	}

}
