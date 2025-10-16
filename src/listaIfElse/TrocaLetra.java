package listaIfElse;

import java.util.Scanner;

public class TrocaLetra {

	public static void main(String args[]) {

		/*
		 * Alg 155: ler uma palavra e, se ela começar pela letra L ou D (também deve ser
		 * considerado l ou d), formar uma nova palavra que terá os dois primeiros
		 * caracteres e o último; caso contrário a nova palavra será formada por todos
		 * os caracteres menos o primeiro
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine().toUpperCase();
		char primeiraLetra = palavra.charAt(0);
		char segundaLetra = palavra.charAt(1);
		char ultimaLetra = palavra.charAt(palavra.length() - 1);

		if(palavra.startsWith("L")) {
			System.out.printf("Nova palavra : %s%s%s" , primeiraLetra , segundaLetra , ultimaLetra);
		}else {
			System.out.println("Nova palavra " + palavra.substring(0 , palavra.length() - 1));
		}
		sc.close();
	}

}
