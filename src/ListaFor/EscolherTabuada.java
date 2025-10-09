package ListaFor;

import java.util.Scanner;

public class EscolherTabuada {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o número que queria imprimir a tabuada : ");

		int tabuada = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resultado = tabuada * i;
			System.out.println("A tabuada de " + tabuada + " x " + i + " = " + resultado);
		}
		sc.close();
	}
}
