package ListaFor;
import java.util.Scanner;
public class ProdutoNumerosLidos {

	public static void main(String args[]) {

		/*
		 * Alg 207: sabendo-se que a UAL calcula o produto através de somas sucessivas,
		 * criar um algoritmo que calcule o produto de dois números lidos. Suponha que
		 * os números lidos sejam positivos e que o multiplicando seja menor do que o
		 * multiplicador.
		 */
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número (multiplicando): ");
        int multiplicando = sc.nextInt();

        System.out.print("Digite o 2º número (multiplicador): ");
        int multiplicador = sc.nextInt();

        int produto = 0;

        if (multiplicando > 0 && multiplicador > 0 && multiplicando < multiplicador) {
            for (int i = 1; i <= multiplicando; i++) {
                produto += multiplicador; // soma sucessiva
            }
            System.out.println("Multiplicação (por somas sucessivas): " + produto);
        } else {
            System.out.println("Inválido! Digite números positivos e com o multiplicando menor que o multiplicador.");
        }

        sc.close();
    }
}
