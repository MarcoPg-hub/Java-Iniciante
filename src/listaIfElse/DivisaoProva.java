package listaIfElse;

import java.util.Scanner;

public class DivisaoProva {

	public static void main(String args[]) {

		/*
		 * Alg 131: a turma de programação, por ter muitos alunos, será dividida em dias
		 * de prova. Após um estudo feito pelo coordenador, decidiu-se dividi-la em três
		 * grupos. Fazer um algoritmo que leia o nome do aluno e indicar a sala em que
		 * ele deverá fazer a prova, tendo em vista a tabela a seguir e sabendo-se que
		 * todas as aslas se encontram no bloco F. o A – K: sala 101 o L – N: sala 102 o
		 * O – Z: sala 103
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		char primeiraLetra = Character.toLowerCase(nome.charAt(0));

		if (primeiraLetra >= 'a' && primeiraLetra <= 'k') {
			System.out.printf("Aluno: %s%nSala: 101%n", nome);
		} else if (primeiraLetra >= 'l' && primeiraLetra <= 'n') {
			System.out.printf("Aluno: %s%nSala: 102%n", nome);
		} else {
			System.out.printf("Aluno: %s%nSala: 103%n", nome);
		}

		sc.close();
	}
}
