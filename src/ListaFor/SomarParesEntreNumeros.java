	package ListaFor;
	
	public class SomarParesEntreNumeros {
		public static void main(String args[]) {
			/*Alg 195: criar um algoritmo que imprima asoma dos números pares entre 25 e 200. */
				
			int par = 0;
			
			for(int i = 25 ; i < 200 ; i++) {
				if ( i % 2 == 0) {
					par += i;
				}
			}
			System.out.println("A soma dos pares é de :  " + par);
		}

	}
