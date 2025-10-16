package listaIfElse;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String args[]) {

		/*
		 * Alg 127: entrar com nome, nota da PR1 e nota da PR2 de um aluno. Imprimir
		 * nome, nota da PR1, nota da PR2, média e uma das mensagens: Aprovado,
		 * reprovado ou em prova final (a média é 7 para aprovação, menor que 3 para
		 * reprovação e as demais em prova final)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome completo do aluno: ");
		String nome = sc.nextLine();

		System.out.println("Digite a nota da PR1 do aluno: ");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a nota da PR2 do aluno: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2.0;

		if (media >= 7) {
			System.out.println("Aluno : " + nome + ", Aprovado.");
		} else if (media < 3) {
			System.out.println("Aluno : " + nome + ", Reprovado.");
		} else {
			System.out.println("Aluno : " + nome + ", em prova final.");
		}

		sc.close();
	}

}
