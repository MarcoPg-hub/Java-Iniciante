package ListaFor;

import java.util.Scanner;

public class CriptografarMensagem {

	public static void main(String args[]) {

		/*
		 * Alg 244: entrar com uma mensagem e criptografá-la da seguinte maneira
		 * (considerar minúsculas e maiúsculas): A vira X, E vira Y, I vira W, O vira K,
		 * U vira Z
		 */
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem para podermos criptografar:");
        String mensagem = sc.nextLine().toLowerCase();

        String mensagemCripto = ""; // aqui vamos construir a mensagem criptografada

        for (int j = 0; j < mensagem.length(); j++) {
            char letra = mensagem.charAt(j);

            // se for vogal, incrementa o caractere
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                letra++; // 'a' -> 'b', 'e' -> 'f', etc.
            }

            // adiciona ao resultado
            mensagemCripto += letra;
        }

        System.out.println("Mensagem criptografada: " + mensagemCripto);
        sc.close();
    }
}

