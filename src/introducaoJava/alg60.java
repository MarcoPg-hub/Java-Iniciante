package introducaoJava;
import java.util.Scanner;
public class alg60 {

	public static void main(String[] args) {
		// Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série.
		// formula an = a1*q^n-1   q= razao , n = termos , a1 igual primeiro termo

		Scanner sc = new Scanner(System.in);
	    
	    System.out.printf("Digite o valor real ou inteiro da razão : ");
	    	double razao = sc.nextDouble();
	    
	    System.out.printf("Digite o valor do 1º termo : ");
	    	double termo1 = sc.nextDouble();
	    
	    	double resultado = termo1 * (Math.pow(razao , 5-1));
	    
		System.out.printf("O cálculo do 5º termo da série é %.2f%n" , resultado);
		
	sc.close();
	}
}

