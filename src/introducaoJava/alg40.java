package introducaoJava;
import java.util.Scanner;
public class alg40 {

	public static void main(String[] args) {
		/*Entrar com dois números inteiros e imprimir a seguinte saída:
		Dividendo
		Divisor
		Quociente
		resto */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dividendo : ");		
		double dividendo = sc.nextDouble();
		
		System.out.println("Digite o valor do divisor : ");		
		double divisor = sc.nextDouble();
		
		double quociente = dividendo/divisor;
		
		double resto = dividendo % divisor;
		
		System.out.println("Dividendo : " +dividendo+ "\nDivisor : " +divisor+ "\nQuociente : " +quociente+ "\nResto : " +resto);
		sc.close();
	}

}
