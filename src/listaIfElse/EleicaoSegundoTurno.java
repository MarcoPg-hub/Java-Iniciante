package listaIfElse;

import java.util.Scanner;

public class EleicaoSegundoTurno {

    public static void main(String args[]) {

        /*
         * Alg 139: sabendo que somente os municípios que possuem mais de 20.000
         * eleitores têm segundo turno nas eleições para prefeito caso o primeiro
         * colocado não tenha mais do que 50% dos votos, fazer um algoritmo que leia o
         * nome do município, a quantidade de eleitores aptos, o número de votos do
         * candidato mais votado e informar se ele terá ou não segundo turno em sua
         * eleição municipal.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do município: ");
        String municipio = sc.nextLine();

        System.out.print("Digite a quantidade de eleitores aptos no município: ");
        int eleitoresAptos = sc.nextInt();

        System.out.print("Digite o número de votos do candidato mais votado: ");
        int numeroVotos = sc.nextInt();

        double percentualVotos = (numeroVotos * 100.0) / eleitoresAptos;

        System.out.printf("\nApuração em %s:\n", municipio);
        System.out.printf("Total de eleitores aptos: %d\n", eleitoresAptos);
        System.out.printf("Percentual do mais votado: %.2f%%\n", percentualVotos);

        if (eleitoresAptos > 20000) {
            if (percentualVotos > 50) {
                System.out.println("Não haverá segundo turno.");
            } else {
                System.out.println("Haverá segundo turno.");
            }
        } else {
            System.out.println("Município com até 20.000 eleitores: não há segundo turno.");
        }

        sc.close();
    }
}
