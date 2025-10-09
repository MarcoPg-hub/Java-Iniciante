package ListaFor;

import java.util.Scanner;

public class SomaDosPares {
	public static void main(String args[]) {
		//Alg 195: criar um algoritmo que imprima a soma dos números pares entre 25 e 200. 
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 25 ; i <= 200 ; i++) {
			if(i % 2 == 0 ) {
				soma +=i;
				
			}
		}
		 System.out.println("A soma dos números pares entre 25 e 200 é: " + soma);
		
		sc.close();
	}

}
