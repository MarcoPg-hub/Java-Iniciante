package ListaFor;

import java.util.Scanner;

public class Palindromos {

    public static void main(String args[]) {

        /*
         * Alg 256: Palíndromos são palavras (ou frases) que são iguais quando lidas de
         * frente para trás e de trás para frente, ignorando os espaços.
         * Exemplos: AME O POEMA, AMOR A ROMA, LUZ AZUL, AMA, ARARA.
         * Criar um algoritmo que leia 15 palavras ou frases e imprima quantas são palíndromos.
         */

        Scanner sc = new Scanner(System.in);

        int totalPalindromos = 0;

        System.out.println("=== Verificador de Palíndromos ===");

        for (int i = 1; i <= 15; i++) {
            System.out.println("\nDigite a " + i + "ª palavra ou frase:");
            String texto = sc.nextLine();

            // remove espaços e deixa tudo minúsculo
            texto = texto.replaceAll(" ", "").toLowerCase();

            // inverte o texto
            String invertida = new StringBuilder(texto).reverse().toString();

            // compara original e invertida
            if (texto.equals(invertida)) {
                totalPalindromos++;
                System.out.println("É um palíndromo!");
            } else {
                System.out.println("Não é um palíndromo.");
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Total de palíndromos encontrados: " + totalPalindromos);

        sc.close();
    }
}
