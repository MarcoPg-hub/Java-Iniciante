package ListaFor;

import java.util.Scanner;

public class InferiorSuperiorMultiploDois {
	public static void main(String args[]) {

		/*
		 * Alg 200: criar um algoritmo que leia os limites inferior e superior de um
		 * intervalo e um número cujo múltiplos se deseja que sejam impressos no
		 * intervalo aberto. Suponha que os dados digitados são para um intervalo
		 * crescente. Limite inferior: 3 Limite superior: 12 Número: 3 Saída: 6 9
		 */

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inferior: ");
        int inferior = sc.nextInt();

        System.out.print("Digite o número superior: ");
        int superior = sc.nextInt();

        System.out.print("Digite o número: ");
        int num = sc.nextInt();

        // calcular o primeiro múltiplo de 'num' maior que o limite inferior
        int primeiroMultiplo = inferior + (num - inferior % num) % num;
        
        if (primeiroMultiplo <= inferior) {
            primeiroMultiplo += num; // garantir que seja maior que inferior
        }

        System.out.print("Múltiplos de " + num + " no intervalo aberto: ");

        // imprimir múltiplos menores que o limite superior
        for (int i = primeiroMultiplo; i < superior; i += num) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}