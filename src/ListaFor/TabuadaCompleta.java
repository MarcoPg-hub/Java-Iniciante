package ListaFor;

public class TabuadaCompleta {

	public static void main(String args[]) {

		/*
		 * Alg 250: criar um algoritmo que imprima a tabuada de multiplicar do número 1
		 * até o número 10;
		 */
		
		int tabuada;
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("===== TABUADA DE X " + i + " =====");			
			for(int j = 1 ; j <= 10 ; j++) {				
				tabuada = i * j;				
				System.out.println("         " + i + " x " + j + " = " + tabuada);
			}
			System.out.println("---------------------------");
		}
		
	}

}
