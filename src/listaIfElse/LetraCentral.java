package listaIfElse;

import java.util.Scanner;

public class LetraCentral {

    public static void main(String[] args) {

        /*
         * Alg 143:
         * Criar um algoritmo que verifique a(s) letra(s) central(is) de uma palavra.
         * Se o número de caracteres for ímpar, ele verifica se a letra central é uma vogal,
         * caso contrário verifica se é um dos dígrafos rr ou ss
         * (só precisa testar letras minúsculas)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra (apenas letras minúsculas): ");
        String palavra = sc.nextLine();

        int tamanho = palavra.length();

        // Verifica se o tamanho é ímpar
        if (tamanho % 2 != 0) {
            char letraCentral = palavra.charAt(tamanho / 2);

            if (letraCentral == 'a' || letraCentral == 'e' ||
                letraCentral == 'i' || letraCentral == 'o' || letraCentral == 'u') {
                System.out.println("A letra central é uma vogal: " + letraCentral);
            } else {
                System.out.println("A letra central não é uma vogal: " + letraCentral);
            }

        } else { // Se o tamanho é par
            String letrasCentrais = palavra.substring(tamanho / 2 - 1, tamanho / 2 + 1);

            if (letrasCentrais.equals("rr") || letrasCentrais.equals("ss")) {
                System.out.println("As letras centrais formam o dígrafo: " + letrasCentrais);
            } else {
                System.out.println("As letras centrais não formam dígrafo rr ou ss: " + letrasCentrais);
            }
        }

        sc.close();
    }
}