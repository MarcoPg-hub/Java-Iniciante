package ListaFor;

import java.util.Scanner;

public class SequenciaFatorial {

    // função para calcular fatorial
    public static double fatorial(int num) {
        double fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        double resultado = 0;
        int sinal = 1; // alterna + e -

        for (int i = 0; i <= n; i++) {
            double numerador = fatorial(n - i);
            double denominador = Math.pow((2 * i + 2), 2); // baseado no padrão do exemplo

            double termo = numerador / denominador;
            resultado += sinal * termo;

            System.out.printf("Termo %d: %s %.5f%n", i+1, (sinal>0?"+":"-"), termo);
            sinal *= -1; // alterna o sinal
        }

        System.out.printf("\nResultado final: %.5f%n", resultado);

        sc.close();
    }
}