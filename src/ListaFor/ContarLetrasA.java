package ListaFor;

import java.util.Scanner;

public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 mensagens para análise:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nMensagem " + i + ": ");
            String mensagem = sc.nextLine();

            int contadorA = 0;

            // Percorre cada caractere da string
            for (int j = 0; j < mensagem.length(); j++) {
                char letra = mensagem.charAt(j);
                if (letra == 'A' || letra == 'a') {
                    contadorA++;
                }
            }

            System.out.println("→ A mensagem " + i + " tem " + contadorA + " letra(s) 'A'.");
        }

        sc.close();
    }
}