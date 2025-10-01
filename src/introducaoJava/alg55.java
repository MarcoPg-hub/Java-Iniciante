package introducaoJava;
import java.util.Scanner;

public class alg55 {

	public static void main(String[] args) {
		// Entrar com nome e idade. Imprimir a seguinte saída: Nome , Idade
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome : ");
			String nome = sc.nextLine();
		
		System.out.println("Digite sua idade : ");
			int idade = sc.nextInt();
		
		System.out.println("Nome : " + nome);
		System.out.println("Idade : " + idade + " anos");

		sc.close();
	}

}
