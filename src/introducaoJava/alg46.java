package introducaoJava;
import java.util.Scanner;

public class alg46 {

	public static void main(String[] args) {
		/*Alg 46: Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo, 
		considerando o reajuste de 1%*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do saldo da aplicação : ");
		double saldo = sc.nextDouble();
		double reajuste = 1/100.0;
		
		double novoSaldo = (saldo*reajuste) + saldo;
		
		System.out.println("O novo saldo com o reajuste de 1% é de : R$" + novoSaldo);
		sc.close();
	}

}
