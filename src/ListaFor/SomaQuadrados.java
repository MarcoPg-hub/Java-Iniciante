package ListaFor;

import java.util.Scanner;

public class SomaQuadrados {

    public static void main(String args[]) {

        /*
         * Alg 212: Entrar com 20 números e imprimir a soma dos números
         * cujos quadrados são menores do que 225.
         */

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            if (numero * numero < 225) { // verifica se o quadrado é menor que 225
                soma += numero;
            }
        }

        System.out.println("Soma dos números cujos quadrados são menores que 225: " + soma);

        sc.close();
    }
}