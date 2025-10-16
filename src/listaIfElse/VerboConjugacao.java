package listaIfElse;

import java.util.Scanner;

public class VerboConjugacao {

    public static void main(String args[]) {

        /*
         * Alg 128: entrar com um verbo no infinitivo e imprimir uma das mensagens:
         * - se o verbo não está no infinitivo
         * - se o verbo é da 1ª conjugação
         * - se o verbo é da 2ª conjugação
         * - se o verbo é da 3ª conjugação
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um verbo no infinitivo: ");
        String verbo = sc.nextLine().toLowerCase().trim(); // trim() → remove espaços extras antes e depois.
        													//toLowerCase() → converte tudo para minúsculas (assim “Amar”, “AMAR” ou “amar” funcionam igual).

        if (verbo.endsWith("ar")) {
            System.out.println("O verbo \"" + verbo + "\" é da 1ª conjugação.");
        } else if (verbo.endsWith("er")) {											//endsWith("er") → verifica se o verbo termina com “ar”.
            System.out.println("O verbo \"" + verbo + "\" é da 2ª conjugação.");
        } else if (verbo.endsWith("ir")) {
            System.out.println("O verbo \"" + verbo + "\" é da 3ª conjugação.");
        } else {
            System.out.println("O verbo \"" + verbo + "\" não está no infinitivo.");
        }

        sc.close();
    }
}