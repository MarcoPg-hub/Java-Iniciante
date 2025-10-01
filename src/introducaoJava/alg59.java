package introducaoJava;
import java.util.Scanner;
public class alg59 {

	public static void main(String[] args) {
		//  Entrar com a razão de uma PA e o valor do 1º termo. Calcular e imprimir o 10º termo da série.
		// serie fibonacci = formula an = a1+(n-1)r
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da razão para o calculo da PA : ");
	    	int r = sc.nextInt();
	    	
	    System.out.println("Digite o valor do 1º termo da PA");
	    	int a1 = sc.nextInt();
	    	
	    	// valor da quantidade de termos da serie PA.
	    	int n = 10;
	    
	    	int a10 = a1+(n-1)*r;
	    
	 
	    System.out.println("O décimo termo é " + a10);
	    
		sc.close();
	}
}
